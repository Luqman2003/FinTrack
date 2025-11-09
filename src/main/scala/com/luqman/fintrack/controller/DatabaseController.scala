package com.luqman.fintrack.controller

import com.luqman.fintrack.service.NotionService
import notion.api.v1.model.search.SearchResults
import org.springframework.web.bind.annotation.{GetMapping, RestController}

@RestController
class DatabaseController(val notionService: NotionService) {

  @GetMapping(Array("/test"))
  def testEndpoint(): SearchResults = {
    val results = notionService.testClient()
    results
  }

  @GetMapping(Array("/hello"))
  def helloWorld(): String = {
    "Hello world!"
  }
}