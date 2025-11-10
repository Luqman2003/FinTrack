package com.luqman.fintrack.model

import jakarta.persistence._
import scala.beans.BeanProperty
import java.util

@Entity
@Table(name = "users")
class UserEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @BeanProperty
  var id: Long = _

  @BeanProperty
  var email: String = _

  @BeanProperty
  var name: String = _

  @OneToMany(mappedBy = "user", cascade = Array(CascadeType.ALL), orphanRemoval = true)
  var notionDatabases: util.List[NotionDatabaseEntity] = new util.ArrayList()
}
