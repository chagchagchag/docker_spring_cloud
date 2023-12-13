import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("com.google.cloud.tools.jib") version "3.4.0"
    id("org.springframework.boot") version "3.1.4"
    id("io.spring.dependency-management") version "1.1.4"
    kotlin("jvm") version "1.9.20"
    kotlin("plugin.spring") version "1.9.20"
}

group = "com.example.demo"
version = "0.0.1-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_17
}

repositories {
    mavenCentral()
    maven { url = uri("https://repo.spring.io/milestone") }
}

extra["springCloudVersion"] = "2022.0.4"

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.cloud:spring-cloud-starter-netflix-eureka-client")
    implementation("de.codecentric:spring-boot-admin-starter-client:3.1.8")
    implementation("org.springframework.boot:spring-boot-starter-actuator")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

dependencyManagement {
    imports {
        mavenBom("org.springframework.cloud:spring-cloud-dependencies:${property("springCloudVersion")}")
    }
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs += "-Xjsr305=strict"
        jvmTarget = "17"
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}

jib {
    val profile : String = System.getenv("JIB_CONTAINER_PROFILE") as? String ?: "local"

    from {
        image = "amazoncorretto:17"
    }

    to {
        image = "chagchagchag/docker-user-history"
        // image tag 는 여러개 지정 가능하다.
        tags = setOf("latest")
    }

    container{
        creationTime = "USE_CURRENT_TIMESTAMP"

        // jvm 옵션
        jvmFlags = listOf(
            "-Dspring.profiles.active=${profile}",
            "-XX:+UseContainerSupport",
            "-Dserver.port=7777",
            "-Dfile.encoding=UTF-8",
        )

        // 컨테이너 입장에서 외부로 노출할 포트
        ports = listOf("7777")

        labels = mapOf(
            "maintainer" to "chagachagchag.dev@gmail.com"
        )
    }

    extraDirectories{

    }
}