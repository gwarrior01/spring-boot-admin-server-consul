plugins {
	java
	alias(libs.plugins.spring.boot)
	alias(libs.plugins.dependency.management)
}

group = "club.twopages"
version = "0.0.1-SNAPSHOT"

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(21)
	}
}

repositories {
	mavenCentral()
}

dependencyManagement {
	imports {
		mavenBom("org.springframework.cloud:spring-cloud-dependencies:2024.0.1")
	}
}


dependencies {
	implementation(libs.spring.boot.starter)
	implementation(libs.spring.boot.starter.admin.server)
	implementation(libs.spring.cloud.consul.discovery)
}

tasks.withType<Test> {
	useJUnitPlatform()
}
