package com.luqman.fintrack.controller

import com.luqman.fintrack.dto.{AddNotionDatabaseRequest, AddUserRequest}
import com.luqman.fintrack.service.UserService
import org.springframework.web.bind.annotation.{GetMapping, PostMapping, RequestBody, RequestMapping, RestController}

@RestController
@RequestMapping(Array("/user"))
class UserController(val userService: UserService) {

  /**
   *
   * @param request
   * @return
   */
  @PostMapping(Array("/add-user"))
  def addUser(@RequestBody request: AddUserRequest): String = {
    userService.createUser(request.email, request.name, request.notionDatabases)
    "added user successfully to database"
  }

  /**
   *
   * @param request
   * @return
   */
  @PostMapping(Array("/add-notion-database"))
  def addNotionDatabase(@RequestBody request: AddNotionDatabaseRequest): String = {
    val user = userService.getUserById(request.userId)
    if (!userService.addNotionDatabase(user.get(), request.notionDatabaseId)) {
      return "Unsuccessfully added notion database"
    }
    "Successfully added notion database"
  }
}