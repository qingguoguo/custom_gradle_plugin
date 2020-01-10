package com.qgg.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.ProjectConfigurationException
import org.gradle.api.artifacts.Configuration

class FatAarPlugin implements Plugin<Project> { // 自定义插件要实现Plugin接口
    Configuration embedConf

    @Override
    void apply(Project project) {
        project.task('fatPluginTask') { // 定义了一个task，名字为CustomPluginTask
            doLast {
                println "*** fat aar 插件***"
                checkAndroidPlugin(project)
                createConfig(project)
            }
        }
    }

    private static void checkAndroidPlugin(Project project) {
        def hasPlugin = project.plugins.hasPlugin("com.android.library")
        if (!hasPlugin) {
            throw new ProjectConfigurationException('fat-aar-plugin must be applied in project that' +
                    ' has android library plugin!', null)
        }
    }

    private void createConfig(Project project) {
        embedConf = project.configurations.create('embed')
        embedConf.visible = false
        embedConf.transitive = false
    }
}
