package com.example.demo.docker_spring_cloud.user_history

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@EnableDiscoveryClient
@SpringBootApplication
class UserHistoryApplication

fun main(args: Array<String>){
    runApplication<UserHistoryApplication>(*args)
}