package com.example.demo.docker_spring_cloud.user_service.application.valueobject

import java.util.UUID

data class CreateUserResponse(
    val id: UUID,
    val email: String,
)
