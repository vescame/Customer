plugins {
    java
    kotlin("jvm") version "1.7.20"
}

repositories {
    mavenCentral()
}

allprojects {
    group = "vescame.customer"
    version = "1.0-SNAPSHOT"
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

subprojects {
    apply(plugin = "java")
    apply(plugin = "kotlin")

    java {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    repositories {
        mavenCentral()
    }

    dependencies {
        implementation("org.springframework.boot:spring-boot-starter:3.0.6")
        testImplementation("org.springframework.boot:spring-boot-starter-test:3.0.6")
        testImplementation("org.junit.jupiter:junit-jupiter-api:5.9.2")
    }

    tasks.withType<Test> {
        useJUnitPlatform()
    }
}
