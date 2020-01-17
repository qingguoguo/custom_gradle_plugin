package com.qgg.plugin


import org.gradle.api.Plugin
import org.gradle.api.Project

class TwoPlugin implements Plugin<Project> {
    @Override
    void apply(Project project) {
        project.extensions.create("hello", TwoPluginExtension)
        project.tasks.create("hello", TwoTask)
    }
}
