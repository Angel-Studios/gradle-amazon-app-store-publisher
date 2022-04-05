# Amazon App Store Deploy Plugin
Plugin for delivering APK artifacts to the Amazon App Store as new Edits.

This plugin is a fork of [gradle-amazon-app-store-publisher](https://github.com/BrantApps/gradle-amazon-app-store-publisher) seeking to update it for Gradle 7+ and clean up the plugin such that it is easier to maintain.

## Setup
1. Create an [Amazon Security Profile](https://developer.amazon.com/docs/app-submission-api/auth.html).
2. Create a Security Profile json file like the following:
      ```json
      {
          "grant_type": "client_credentials",
          "client_id": "amzn1.application-oa2-client.<id>",
          "client_secret": "<secret from web settings tab of security profile>",
          "scope": "appstore::apps:readwrite"
      }
      ```
3. Add the [plugin](https://plugins.gradle.org/plugin/com.angel.amazon-app-store-publisher) to your project 
4. Configure the `amazon { }` closure in your application module build script.
    ```groovy
    amazon {
        securityProfile.set(rootProject.file("security-profile.json"))
        applicationId.set("amzn1.devportal.mobileapp.<id>")
        replaceEdit.set(false)
        replaceApks.set(true)
        useOnlyUniversalApk.set(true)
    }
    ```
5. Run `gradlew publishToAmazonAppStore` to assemble and publish your application.

## Resources
 * [Amazon Publishing API](https://developer.amazon.com/docs/app-submission-api/overview.html)
