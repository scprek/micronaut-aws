plugins {
    id("io.micronaut.build.internal.module")
}

dependencies {
    api(project(":aws-sdk-v2"))
    api(project(":aws-distributed-configuration"))
    api(libs.awssdk.secretsmanager)
}
