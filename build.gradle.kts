// Top-level build file where you can add configuration options common to all sub-projects/modules.

//buildscript {
//    repositories {
//        google() // Ensure Google's Maven repository is included
//        // other repositories if needed
//    }
//    dependencies {
//        classpath(libs.gradle) // Use the desired version here
//    }
//}

plugins {
//    id("com.android.application") version "8.3.1" apply false
//    id("org.jetbrains.kotlin.android") version("1.7.10") apply false
//    id("com.android.library") version "8.3.1" apply false
    alias(libs.plugins.androidApplication) apply false
}



