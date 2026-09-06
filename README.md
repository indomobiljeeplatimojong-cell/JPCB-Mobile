# JPCB Mobile — HP Upload Edition

Android wrapper untuk membuka Web App JPCB.

## Kenapa versi ini dibuat khusus HP?

GitHub melalui browser HP tidak nyaman meng-upload struktur folder Android sekaligus. Karena itu source project dibuat sesederhana mungkin: file utama berada di root repository.

## File yang di-upload dari HP

Upload file berikut langsung ke root repository `JPCB-Mobile`:

- `build.gradle.kts`
- `settings.gradle.kts`
- `gradle.properties`
- `proguard-rules.pro`
- `AndroidManifest.xml`
- `MainActivity.kt`
- `.gitignore`

## Workflow GitHub Actions

Setelah file di atas masuk, buat **1 file baru** melalui GitHub:

`Add file` → `Create new file`

Nama/path file:

`.github/workflows/build-apk.yml`

Isi workflow ada pada paket ini dengan nama `build-apk.yml`.

## Build

Setelah workflow dibuat:

`Actions` → `Build JPCB Mobile APK` → `Run workflow`

APK akan tersedia pada `Artifacts` dengan nama:

`JPCB-Mobile-debug`
