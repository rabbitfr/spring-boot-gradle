/*
 * This file was generated by the Gradle 'init' task.
 */

plugins {
    // Support convention plugins written in Kotlin. Convention plugins are build scripts in 'src/main' that automatically become available as plugins in the main build.
    `kotlin-dsl`
}

repositories {
    // Use the plugin portal to apply community plugins in convention plugins.
    gradlePluginPortal()

    mavenCentral()

}

/**
 * trouver le plugin sur le portal: https://plugins.gradle.org/plugin/org.jetbrains.kotlin.plugin.spring
 */
dependencies {
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin")
    implementation("org.springframework.boot:spring-boot-gradle-plugin:2.6.3")
    // le plugin `org.jetbrains.kotlin.plugin.spring` est contenu dans l'artifact `org.jetbrains.kotlin:kotlin-allopen`
    implementation("org.jetbrains.kotlin:kotlin-allopen")
}

