package com.github.sametaylak.raitheme.services

import com.intellij.openapi.project.Project
import com.github.sametaylak.raitheme.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
