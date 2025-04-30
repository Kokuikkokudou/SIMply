plugins {
    // 共通プラグインの占位。apply false で二重ロード防止
    kotlin("jvm") apply false
}

allprojects {
    repositories {
        mavenCentral()
    }
}
