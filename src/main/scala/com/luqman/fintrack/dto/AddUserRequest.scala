package com.luqman.fintrack.dto

import java.util.Optional

case class AddUserRequest(
                         email: String,
                         name: String,
                         notionDatabases: Optional[List[String]]
                         )
