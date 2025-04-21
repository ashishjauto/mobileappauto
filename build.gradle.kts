plugins {
    id("java")
}

group = "org.mobile.auto"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {

    // https://mvnrepository.com/artifact/io.appium/java-client
    implementation("io.appium:java-client:9.4.0")
    // https://mvnrepository.com/artifact/org.testng/testng
    testImplementation("org.testng:testng:7.11.0")
}

