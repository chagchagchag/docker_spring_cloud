cd ..

./gradlew :spring-cloud:config-server:clean
./gradlew :spring-cloud:config-server:jibDockerBuild
./gradlew :spring-cloud:config-server:jib
./gradlew :spring-cloud:eureka-server:clean
./gradlew :spring-cloud:eureka-server:jibDockerBuild
./gradlew :spring-cloud:eureka-server:jib