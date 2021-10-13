plugins {
    id("com.google.protobuf") version "0.8.15" apply false
    kotlin("jvm") version "1.4.32" apply false
}

// todo: move to subprojects, but how?
ext["grpcVersion"] = "1.37.0"
ext["grpcKotlinVersion"] = "1.1.0" // CURRENT_GRPC_KOTLIN_VERSION
ext["protobufVersion"] = "3.15.8"

allprojects {
    repositories {
        mavenLocal()
        mavenCentral()
        google()
    }
}