# Campus News Android App

Jetpack Compose Android prototype for a campus news platform with role-based access.

## Implemented Features

- User registration/login concept with role selection (`STUDENT`, `EDITOR`, `JOURNALIST`, `ADMIN`)
- Article creation, drafting, submission, approval/rejection, and publishing workflow
- News browsing by categories (`Announcements`, `Events`, `Research`, `Sports`)
- Multimedia attachment placeholders (comma-separated file names for images/videos/audio)
- Commenting and reactions on articles
- Push notification feed simulation for breaking news and verified announcements
- Admin dashboard with basic system activity metrics

## Project Structure

- `app/src/main/java/com/campus/news/MainActivity.kt` - app entry + all UI/state logic
- `app/src/main/AndroidManifest.xml` - Android app manifest
- `app/build.gradle.kts` - app module configuration

## Run

1. Open this folder in Android Studio.
2. Let Gradle sync and install missing SDK components.
3. Run on emulator/device (API 24+).

## Notes

- Current data layer is in-memory for fast prototyping.
- To make this production-ready, add:
  - backend API integration (auth, articles, comments, notifications)
  - secure token storage
  - real media upload using multipart APIs
  - Firebase/OneSignal push messaging
  - Room caching and offline sync
