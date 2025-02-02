plugins {
    id("io.micronaut.build.internal.module")
}

dependencies {
    annotationProcessor(mn.micronaut.graal)

    compileOnly(mn.micronaut.security)

    implementation(mn.micronaut.http.netty)

    implementation(libs.projectreactor)

    api(mn.micronaut.http.server)
    api(libs.managed.aws.serverless.core) {
        exclude(group = "javax.servlet", module = "javax.servlet-api")
        exclude(group = "com.fasterxml.jackson.module", module = "jackson-module-afterburner")
        exclude(group = "commons-logging")
    }
    api(libs.managed.jcl.over.slf4j)
    api(project(":function-aws"))
    api(project(":aws-common"))

    testAnnotationProcessor(mn.micronaut.validation)
    testImplementation(mn.micronaut.validation)

    testImplementation(mn.micronaut.inject.java)
    testImplementation(mn.micronaut.http.client)
    testImplementation(mn.micronaut.security)

    testImplementation(mn.micronaut.views.handlebars)

    testImplementation(libs.jackson.afterburner)
    testImplementation(libs.servlet.api)
    testImplementation(libs.fileupload)
}

spotless {
    java {
        targetExclude("**/io/micronaut/function/aws/proxy/QueryStringDecoder.java")
    }
}
