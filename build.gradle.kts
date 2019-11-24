plugins {
    base
    id("org.springframework.boot") version "2.2.1.RELEASE" apply false
    id("io.spring.dependency-management") version "1.0.8.RELEASE" apply false
    kotlin("jvm") version "1.3.50" apply false
    kotlin("plugin.spring") version "1.3.50" apply false
}


allprojects {

    repositories {
        mavenCentral()
    }
}