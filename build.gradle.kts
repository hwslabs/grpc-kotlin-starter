plugins {
    id("com.google.protobuf") version "0.8.18" apply false
    kotlin("jvm") version "1.7.0" apply false
}

// todo: move to subprojects, but how?
ext["grpcVersion"] = "1.46.0"
ext["grpcKotlinVersion"] = "1.2.1" // CURRENT_GRPC_KOTLIN_VERSION
ext["protobufVersion"] = "3.20.1"

allprojects {
    repositories {
        mavenLocal()
        mavenCentral()
        google()
    }
}