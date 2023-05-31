package com.polylab.department

import com.jxareas.jxelerator.annotations.EnableJxelerator
import com.jxareas.jxelerator.annotations.EnableNonRestrictiveCorsPolicy
import com.jxareas.jxelerator.extensions.runApp
import org.springframework.boot.autoconfigure.SpringBootApplication

@EnableJxelerator
@EnableNonRestrictiveCorsPolicy
@SpringBootApplication
open class DepartmentServiceApplication

fun main(vararg args : String) = runApp(DepartmentServiceApplication::class, *args)
