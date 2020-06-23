# ReadOnlyGradle
Highly Experimental gradle plugin

Usage
----

1. Add the following to your build.gradle

   ```groovy
   buildscript {
      repositories {
         mavenCentral()
      }

      dependencies {
         classpath 'com.github.saadfarooq:gradle-common-deps-plugin:{version}'
      }
   }

   repositories {
      mavenCentral()
   }

   apply plugin: 'com.android.application'
   apply plugin: 'com.github.saadfarooq.commondeps'
   ```
   alternatively, you can use the new plugin syntax for gradle `2.1+`
   ```groovy
   plugins {
      id "com.github.saadfarooq.commondeps" version "<latestVersion>"
   }
   ```

