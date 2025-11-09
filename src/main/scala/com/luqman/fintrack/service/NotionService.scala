package com.luqman.fintrack.service

import notion.api.v1.NotionClient
import notion.api.v1.model.search.SearchResults
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate

// deals with the connection to plaid and makes the calls to plaids api
@Service
class NotionService(val restTemplate: RestTemplate, val client: NotionClient) {

  // need to create a page using the endpoint described here:
  //        https://developers.notion.com/reference/post-page
//  def appendPageToDatabase() = {
//
//  }

  def testClient(): SearchResults = {
    try {
      val results: SearchResults = client.search("Test Database")

      results
    } finally {
      client.close()
    }
  }
}