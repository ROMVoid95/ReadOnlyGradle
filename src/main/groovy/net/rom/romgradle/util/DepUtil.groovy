package net.rom.romgradle.util

class DepUtil {
	
    def static setDepProperty(String group, String packge, version, String defaultVersion) {
		if (version != false) {
			def ver = version instanceof Boolean ? defaultVersion : version
			return "${group}:${packge}:${ver}"
		}
	}
}
