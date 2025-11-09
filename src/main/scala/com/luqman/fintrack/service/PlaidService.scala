package com.luqman.fintrack.service

import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate

// deals with the connection to plaid and makes the calls to plaids api
@Service
class PlaidService (val restTemplate: RestTemplate) {

//  def connectAccount() = {
//
//  }
}