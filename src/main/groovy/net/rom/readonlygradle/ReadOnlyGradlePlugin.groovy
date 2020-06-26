package net.rom.readonlygradle

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.artifacts.DependencyResolutionListener
import org.gradle.api.artifacts.ResolvableDependencies

class ReadOnlyGradlePlugin implements Plugin<Project> {
	
    def compileDeps
    def logger
    Project project

    @Override
    void apply(Project project) {
		this.project = project
		ReadOnlyGradleExtension rog = project.extensions.create("rog", ReadOnlyGradleExtension)
		
		logger = project.logger
		compileDeps = project.getConfigurations().getByName("compile").getDependencies()
		project.getGradle().addListener(new DependencyResolutionListener() {
			@Override
			void beforeResolve(ResolvableDependencies resolvableDependencies) {
				addDep(rog)

				project.getGradle().removeListener(this)
			}

			@Override
			void afterResolve(ResolvableDependencies resolvableDependencies) {}
		})
	}
	
	def addDep(rog) {
		rog.getProperties().each { prop, val ->
			if (val.getClass().equals(String.class) && val ==~/.*:*:.*/) {
				logger.info "${prop}, ${val}"
				compileDeps.add(project.getDependencies().create(val))
			}
		}
	}
}
