allprojects {
    repositories {
        mavenLocal()
        mavenCentral()
        google()
    }

    version = System.getenv().getOrDefault("PROJECT_VERSION", "1.0.0")
}
