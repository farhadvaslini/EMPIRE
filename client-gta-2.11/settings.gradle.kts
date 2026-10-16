pluginManagement {
    repositories {
        maven { url = uri("https://maven.aliyun.com/repository/google") }
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}
rootProject.name = "GTA-2.11"
include(":app")