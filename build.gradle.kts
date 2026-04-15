import java.io.File

plugins {
    id("com.android.application") version "8.5.2" apply false
    id("org.jetbrains.kotlin.android") version "1.9.24" apply false
    id("com.google.gms.google-services") version "4.4.4" apply false
}

val localAppData = System.getenv("LOCALAPPDATA")
    ?: "${System.getProperty("user.home")}\\AppData\\Local"
val sharedBuildRoot = File(localAppData, "CampusNewsBuild")

allprojects {
    layout.buildDirectory.set(sharedBuildRoot.resolve(name))
}
