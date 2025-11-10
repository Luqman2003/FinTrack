package com.luqman.fintrack.model

import jakarta.persistence._
import scala.beans.BeanProperty

@Entity
@Table(name = "notion_databases")
class NotionDatabaseEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @BeanProperty
  var id: Long = _

  @BeanProperty
  var notionDatabaseId: String = _

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "user_id")
  var user: UserEntity = _
}
