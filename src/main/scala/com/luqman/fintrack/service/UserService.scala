package com.luqman.fintrack.service

import com.luqman.fintrack.model.{NotionDatabaseEntity, UserEntity}
import com.luqman.fintrack.repositories.{NotionDatabaseRepository, UserRepository}
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

import java.util.Optional

@Service
class UserService(val userRepo: UserRepository) {
  @Transactional
  def createUser(email: String, name: String, dbIds: Optional[List[String]]): UserEntity = {
    val user = new UserEntity
    user.email = email
    user.name = name

    if (!dbIds.isEmpty) {
      dbIds.get().foreach { dbId =>
        addNotionDatabase(user, dbId)
      }
    }
    userRepo.save(user)
  }

  @Transactional
  def addNotionDatabase(user: UserEntity, dbId: String): Boolean = {
    if (!doesUserExist(user)) {
      return false
    }
    val notionDb = new NotionDatabaseEntity
    notionDb.notionDatabaseId = dbId
    notionDb.user = user
    user.notionDatabases.add(notionDb)
    true
  }

  def doesUserExist(user: UserEntity): Boolean = {
    if (userRepo.existsByEmail(user.email) && userRepo.existsById(user.id)) {
      return true
    }
    false
  }

  def getUserById(userId: Long): Optional[UserEntity] = {
    userRepo.findById(userId)
  }
}
