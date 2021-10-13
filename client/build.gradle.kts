plugins {
    application
    kotlin("jvm")
}

dependencies {
    implementation(project(":stub"))
    runtimeOnly("io.grpc:grpc-netty:${rootProject.ext["grpcVersion"]}")
}

tasks.register<JavaExec>("BarClient") {
    dependsOn("classes")
    classpath = sourceSets["main"].runtimeClasspath
    mainClass.set("com.hypto.hws.services.starter.BarClientKt")
}

val barClientStartScripts = tasks.register<CreateStartScripts>("barClientStartScripts") {
    mainClass.set("com.hypto.hws.services.starter.BarClientKt")
    applicationName = "bar-client"
    outputDir = tasks.named<CreateStartScripts>("startScripts").get().outputDir
    classpath = tasks.named<CreateStartScripts>("startScripts").get().classpath
}

tasks.named("startScripts") {
    dependsOn(barClientStartScripts)
}
