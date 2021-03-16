package com.github.yezhishu.kotlinmvparms.services

import com.github.yezhishu.kotlinmvparms.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
