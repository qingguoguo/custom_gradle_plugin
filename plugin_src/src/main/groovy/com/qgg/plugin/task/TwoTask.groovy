package com.qgg.plugin.task

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class TwoTask extends DefaultTask{
    TwoTask() {
        group = 'com.qgg'
        description = 'com.qgg first task'
    }

    @TaskAction
    def hello() {
        println "two plugin: Hello World!"
    }
}
