package com.example.demo.docker_spring_cloud.user_service.application

import com.example.demo.docker_spring_cloud.user_service.application.factory.CreateUserResponseFactory
import com.example.demo.docker_spring_cloud.user_service.application.factory.ReadUserResponseFactory
import com.example.demo.docker_spring_cloud.user_service.application.valueobject.CreateUserRequest
import com.example.demo.docker_spring_cloud.user_service.application.valueobject.CreateUserResponse
import com.example.demo.docker_spring_cloud.user_service.application.valueobject.ReadUserResponse
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/")
class FoobarUserController (
    val createUserResponseFactory: CreateUserResponseFactory,
    val readUserResponseFactory: ReadUserResponseFactory,
){

    @PostMapping("/users")
    fun createUser(@RequestBody user: CreateUserRequest)
    : ResponseEntity<CreateUserResponse>{
        return ResponseEntity
            .status(HttpStatus.OK)
            .body(createUserResponseFactory.toCreateUserResponse(user.email))
    }

    @GetMapping("/user/{userId}")
    fun getUser(@PathVariable("userId") email: String)
    : ResponseEntity<ReadUserResponse>{
        return ResponseEntity
            .status(HttpStatus.OK)
            .body(readUserResponseFactory.toReadUserResponse(email))
    }

    @GetMapping("/welcome")
    fun welcome(): ResponseEntity<String>{
        return ResponseEntity
            .status(HttpStatus.OK)
            .body("안녕하쎄요")
    }


}