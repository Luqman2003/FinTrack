package com.luqman.fintrack.repositories

import com.luqman.fintrack.model.NotionDatabaseEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
trait NotionDatabaseRepository extends JpaRepository[NotionDatabaseEntity, java.lang.Long]
