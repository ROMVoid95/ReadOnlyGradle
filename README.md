# ReadOnlyGradle
Highly Experimental gradle plugin

Usage
----

1. Add the following to your build.gradle

   ```groovy
	buildscript {
  		repositories {
    		maven {
      			url "https://plugins.gradle.org/m2/"
    		}
  		}
  		dependencies {
    		classpath "gradle.plugin.net.rom.romgradle:ReadOnlyGradle:{version}"
  		}
	}

	apply plugin: "net.rom.romgradle"
   ```
   alternatively, you can use the new plugin syntax for gradle `2.1+`
   ```groovy
	plugins {
		id "net.rom.romgradle" version "{version}"
	}
   ```

