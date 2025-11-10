package com.luqman.fintrack.repositories

import com.luqman.fintrack.model.UserEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
trait UserRepository extends JpaRepository[UserEntity, java.lang.Long] {
  def existsByEmail(email: String): Boolean

  def findByEmail(email: String): Option[UserEntity]

}
