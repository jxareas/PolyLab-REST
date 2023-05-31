package com.polylab.department

import com.jxareas.jxelerate.annotations.EnableJxelerate
import com.jxareas.jxelerate.annotations.EnableNonRestrictiveCorsPolicy
import com.jxareas.jxelerate.common.extensions.runApp
import org.springframework.boot.autoconfigure.SpringBootApplication

@EnableJxelerate
@EnableNonRestrictiveCorsPolicy
@SpringBootApplication
open class DepartmentServiceApplication

fun main(vararg args : String) = runApp(DepartmentServiceApplication::class, *args)
