package com.example.demo.docker_spring_cloud.discovery_client

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@EnableDiscoveryClient
@SpringBootApplication
class DiscoveryClientApplication

fun main(args: Array<String>) {
    runApplication<DiscoveryClientApplication>(*args)
}