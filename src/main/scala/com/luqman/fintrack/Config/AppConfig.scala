package com.luqman.fintrack.Config

import notion.api.v1.NotionClient
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.{Bean, Configuration}

@Configuration
class AppConfig {

  @Value("${notion.api-token}")
  private val notionApiKey: String = ""

  @Bean
  def notionClient(): NotionClient = {
    val client = new NotionClient(notionApiKey)
    client
  }
}