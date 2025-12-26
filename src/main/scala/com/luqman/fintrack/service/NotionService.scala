package com.luqman.fintrack.service

import notion.api.v1.NotionClient
import notion.api.v1.model.search.SearchResults
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate

// deals with the connection to plaid and makes the calls to plaids api
@Service
class NotionService(val client: NotionClient) {/* TODO: after implementing plaid logic, deal with this */}