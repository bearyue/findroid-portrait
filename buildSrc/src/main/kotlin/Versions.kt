import org.gradle.api.JavaVersion

object Versions {
    const val appCode = 29
    const val appName = "0.15.3"

    const val compileSdk = 35
    const val buildTools = "35.0.0"
    const val minSdk = 28
    const val targetSdk = 35

    // Keep the local build compatible with the JDK 17 toolchain available on
    // this workstation. The portrait-playback change does not require Java 21.
    val java = JavaVersion.VERSION_17

    const val ktlint = "0.50.0"
}
