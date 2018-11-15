package com.no502zhang.project.domain

import java.util.*

class Project(code: String, name: String, description: String?, beginTime: Date, plannedCompletionTime: Date?, actualCompletionTime: Date?) {

    val code = code

    var name = name

    var description = description

    val beginTime = beginTime

    var plannedCompletionTime = plannedCompletionTime

    val actualCompletionTime = actualCompletionTime
}