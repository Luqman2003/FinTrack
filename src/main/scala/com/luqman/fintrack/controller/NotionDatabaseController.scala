package com.luqman.fintrack.controller

import com.luqman.fintrack.service.NotionService
import notion.api.v1.model.search.SearchResults
import org.springframework.web.bind.annotation.{GetMapping, PostMapping, RestController}

@RestController()
class NotionDatabaseController(val notionService: NotionService) {/* TODO: after implementing plaid logic, deal with this */}