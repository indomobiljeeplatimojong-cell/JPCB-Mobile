# JPCB Mobile

Android WebView wrapper untuk membuka Web App JPCB.

## Struktur project

- `app/src/main/java/com/jpcb/mobile/MainActivity.java`
- `app/src/main/AndroidManifest.xml`
- `app/src/main/res/values/strings.xml`
- `app/src/main/res/values/styles.xml`
- `app/build.gradle.kts`
- `app/proguard-rules.pro`
- `build.gradle.kts`
- `settings.gradle.kts`
- `gradle.properties`
- `.github/workflows/build-apk.yml`

## GitHub Actions

Setelah semua file berada pada branch `main`, workflow akan otomatis membuat APK Debug.

APK dapat diambil dari:
**Actions → Build JPCB Mobile APK → Artifacts → JPCB-Mobile-debug**.

Project sengaja menggunakan Java, bukan Kotlin, untuk menghindari masalah task `compileDebugKotlin` pada build sebelumnya.
