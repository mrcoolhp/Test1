package com.github.mrcoolhp.test1.services

import com.intellij.openapi.project.Project
import com.github.mrcoolhp.test1.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
