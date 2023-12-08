rootProject.name = "docker_spring_cloud"
include("spring-cloud")
include("spring-cloud:config-server")
include("spring-cloud:eureka-server")
include("spring-cloud:admin-dashboard")

include("foobar-user-api")
include("foobar-user-api:foobar-user-history")
include("foobar-user-api:foobar-user-service")
