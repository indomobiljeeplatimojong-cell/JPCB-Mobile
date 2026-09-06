plugins {
    id("com.android.application") version "8.7.3"
    id("org.jetbrains.kotlin.android") version "2.0.21"
}

android {
    namespace = "com.jpcb.mobile"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.jpcb.mobile"
        minSdk = 23
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
    }

    // Semua source sengaja diletakkan di root agar mudah di-upload dari HP.
    sourceSets["main"].apply {
        manifest.srcFile("AndroidManifest.xml")
        java.srcDirs(".")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.15.0")
    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("androidx.activity:activity-ktx:1.10.0")
    implementation("androidx.webkit:webkit:1.12.1")
}

// Nama APK hasil build
base {
    archivesName.set("JPCB-Mobile-debug")
}
