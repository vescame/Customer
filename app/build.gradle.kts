plugins {
    id("org.springframework.boot") version "3.0.6"
}

springBoot {
    mainClass.set("vescame.customer.App")
}

dependencies {
    implementation(project(":entities"))
}