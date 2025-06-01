plugins {
    alias(libs.plugins.multiplatform) apply false
    alias(libs.plugins.maven) apply false
}

allprojects {
    group = "digital.guimauve.koxxy"
    version = "1.0.0"

    repositories {
        mavenCentral()
    }
}
