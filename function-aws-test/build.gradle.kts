plugins {
    id("io.micronaut.build.internal.module")
}

dependencies {
    implementation(mn.micronaut.test.junit5)

    api(project(":function-aws"))
    api(mn.micronaut.function)
    testAnnotationProcessor(mn.micronaut.inject.java)
}
