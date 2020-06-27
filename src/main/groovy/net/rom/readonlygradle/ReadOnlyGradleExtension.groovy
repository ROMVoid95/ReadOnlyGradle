package net.rom.readonlygradle

import net.rom.readonlygradle.util.Util

class ReadOnlyGradleExtension {
	
		String galacticraftcore
		String galacticraftplanets
		String galacticraftapi
		String micdoodlecore
		String forgegradle
		
		def galacticraftcore(version) {
			galacticraftcore = Util.setDepProperty("GC-1.12-dev", "GalacticraftCore-Dev", version, DefaultVersions.GALACTICRAFT)
		}
		
		def galacticraftplanets(version) {
			galacticraftcore = Util.setDepProperty("GC-1.12-dev", "Galacticraft-Planets-Dev", version, DefaultVersions.GALACTICRAFT)
		}
		
		def galacticraftapi(version) {
			galacticraftcore = Util.setDepProperty("GC-1.12-dev", "Galacticraft-API", version, DefaultVersions.GALACTICRAFT)
		}
		
		def micdoodlecore(version) {
			galacticraftcore = Util.setDepProperty("GC-1.12-dev", "MicdoodleCore-Dev", version, DefaultVersions.GALACTICRAFT)
		}
}
