package com.luqman.fintrack.service

import org.springframework.stereotype.Service
import com.plaid.client.ApiClient
// deals with the connection to plaid and makes the calls to plaids api
@Service
class PlaidService () {
  private val apiClient = new ApiClient()
}