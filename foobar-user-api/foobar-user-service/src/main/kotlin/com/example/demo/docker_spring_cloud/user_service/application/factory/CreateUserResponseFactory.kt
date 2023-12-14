package com.example.demo.docker_spring_cloud.user_service.application.factory

import com.example.demo.docker_spring_cloud.user_service.application.valueobject.CreateUserResponse
import org.springframework.stereotype.Component
import java.util.*

@Component
class CreateUserResponseFactory {

    fun toCreateUserResponse(email: String)
    : CreateUserResponse {
        return CreateUserResponse(
            UUID.randomUUID(),
            email,
        )
    }

}