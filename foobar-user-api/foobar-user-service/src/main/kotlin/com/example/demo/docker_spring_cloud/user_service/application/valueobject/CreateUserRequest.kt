package com.example.demo.docker_spring_cloud.user_service.application.valueobject

data class CreateUserRequest(
    val email: String,
    val password: String,
)
