plugins {
    id("com.android.application")
}

android {
    namespace = "com.jpcb.mobile"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.jpcb.mobile"
        minSdk = 23
        targetSdk = 35
        versionCode = 2
        versionName = "2.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}
