package com.qgg.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.ProjectConfigurationException

class FatAarPlugin implements Plugin<Project> { // 自定义插件实现Plugin接口
    @Override
    void apply(Project project) {
        project.task('fatPluginTask') { // 定义了一个task，名字为CustomPluginTask
            doLast {
                println "*** fat aar 插件***"
                checkAndroidPlugin(project)
            }
        }
    }

    private static boolean checkAndroidPlugin(Project project) {
        def hasPlugin = project.plugins.hasPlugin("com.android.library")
        if (!hasPlugin) {
            throw new ProjectConfigurationException('fat-aar-plugin must be applied in project that' +
                    ' has android library plugin!', null)
        }
    }
}
