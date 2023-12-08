package com.example.demo.docker_spring_cloud.admin_dashboard

import de.codecentric.boot.admin.server.config.EnableAdminServer
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@EnableAdminServer
@EnableDiscoveryClient
@SpringBootApplication
class AdminDashboardApplication

fun main(args: Array<String>){
    runApplication<AdminDashboardApplication>(*args)
}