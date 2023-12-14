package com.example.demo.docker_spring_cloud.user_service.application.factory

import com.example.demo.docker_spring_cloud.user_service.application.valueobject.ReadUserResponse
import org.springframework.stereotype.Component
import java.util.UUID

@Component
class ReadUserResponseFactory {

    fun toReadUserResponse(
        email: String,
    ): ReadUserResponse {
        return ReadUserResponse(
            email = email,
            id = UUID.randomUUID(),
        )
    }

}