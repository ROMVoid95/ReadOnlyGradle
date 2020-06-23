package net.rom.romgradle

import org.gradle.api.Plugin
import org.gradle.api.Project

import com.matthewprenger.cursegradle.CurseGradlePlugin

import net.rom.romgradle.util.ForgeG
import net.rom.romgradle.util.UserForgeG

class ReadOnlyGradlePlugin implements Plugin<Project> {
	
	def project

    @Override
    void apply(Project project) {
		this.project = project
		//project.getPluginManager().apply(ForgeG.class)
		project.getPluginManager().apply(UserForgeG.class)
		project.getPluginManager().apply(CurseGradlePlugin.class)
	}
	
	def addDep(support) {
		support.getProperties().each { prop, val ->
			if (val.getClass().equals(String.class) && val ==~/.*:*:.*/) {
				logger.info "${prop}, ${val}"
				compileDeps.add(project.getDependencies().create(val))
			}
		}
	}
}
