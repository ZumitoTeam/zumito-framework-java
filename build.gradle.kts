/*
 * Copyright (c) 2023.
 *
 * TODO
 */

plugins {
	id("java")
	kotlin("jvm") version "1.8.21"
}

group = "ga.zumito"
version = "0.00.01-SNAPSHOT"

repositories {
	mavenCentral()
}

dependencies {
	testImplementation(platform("org.junit:junit-bom:5.9.1"))
	testImplementation("org.junit.jupiter:junit-jupiter")
	implementation("net.dv8tion:JDA:5.0.0-beta.9")
	implementation("org.mongodb:mongodb-driver-sync:4.10.0-alpha0")
}

tasks.test {
	useJUnitPlatform()
}