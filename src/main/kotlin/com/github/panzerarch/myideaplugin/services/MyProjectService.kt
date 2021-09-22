package com.github.panzerarch.myideaplugin.services

import com.intellij.openapi.project.Project
import com.github.panzerarch.myideaplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
