version = 1

android {
    namespace = "com.shakzz.verse"
    compileSdk = 35

    defaultConfig {
        minSdk = 21
    }

    buildFeatures {
        buildConfig = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.16.0")
    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("com.google.android.material:material:1.12.0")
}

cloudstream {
    language = "ta"
    description = "Netflix, PrimeVideo, Disney+ Hotstar Contents in Multiple Languages"
    authors = listOf("Shakzz")
    status = 1
    tvTypes = listOf("Movie", "TvSeries")
    requiresResources = true
    iconUrl = ""
}