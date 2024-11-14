package com.devndev.ourhome.buildsrc

import org.gradle.api.JavaVersion

object AppConfig {
    const val compileSdk = 34
    const val minSdk = 26
    const val targetSdk = 34
    const val kotlinCompilerExtension = "1.5.1"

    const val applicationId = "com.devndev.ourhome"
    const val appNameSpace = "com.devndev.ourhome"

    const val appVersionCode = 1
    const val appVersionName = "1.0"

    const val dataNameSpace = "com.devndev.ourhome.data"
    const val domainNameSpace = "com.devndev.ourhome.domain"
    const val presentationNameSpace = "com.devndev.ourhome.presentation"

    const val testRunner = "androidx.test.runner.AndroidJUnitRunner"

    val sourceCompatibility = JavaVersion.VERSION_17
    val targetCompatibility = JavaVersion.VERSION_17
    val jvmTarget = JavaVersion.VERSION_17.toString()
}