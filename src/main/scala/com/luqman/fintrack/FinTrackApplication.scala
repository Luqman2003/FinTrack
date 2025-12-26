package com.luqman.fintrack

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean
import org.springframework.web.client.RestTemplate

object FinTrackApplication extends App {
  SpringApplication.run(classOf[FinTrackApplication])

  @SpringBootApplication
  class FinTrackApplication
}