package com.qgg.plugin

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class TwoTask extends DefaultTask{
    TwoTask() {
        group = 'com.qgg'
        description = 'com.qgg first task'
    }

    @TaskAction
    def hello() {
        println "plugin 不同的实现方式: Hello World!"
    }
}
