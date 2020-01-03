package com.qgg.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

class CustomOnePlugin implements Plugin<Project> { // 自定义插件实现Plugin接口
    @Override
    void apply(Project project) {
        project.task('CustomPluginTask') { // 定义了一个task，名字为CustomPluginTask
            doLast {
                println "自定义插件"
            }
        }
    }
}
