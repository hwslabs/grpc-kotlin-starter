rootProject.name = "grpc-kotlin-starter"

include("protos", "stub", "client", "server")

pluginManagement {
    repositories {
        gradlePluginPortal()
        jcenter()
        google()
    }
}
