# ReadOnlyGradle
Highly Experimental gradle plugin

[gradle]: https://plugins.gradle.org/plugin/net.rom.romgradle
[gradle-icon]: https://img.shields.io/endpoint?url=https%3A%2F%2Fraw.githubusercontent.com%2FROMVoid95%2FReadOnlyGradle%2Fmaster%2Ficon.json
[release]: https://github.com/ROMVoid95/ReadOnlyGradle/releases/latest
[release-icon]: https://img.shields.io/github/v/release/ROMVoid95/ReadOnlyGradle
[ ![gradle-icon][] ][gradle]
[ ![release-icon][] ][release]

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

