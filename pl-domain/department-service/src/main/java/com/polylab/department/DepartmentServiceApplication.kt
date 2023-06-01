package com.polylab.department

import com.jxareas.efficax.annotations.EnableEfficax
import com.jxareas.efficax.annotations.EnableNonRestrictiveCorsPolicy
import com.jxareas.efficax.common.extensions.runApp
import org.springframework.boot.autoconfigure.SpringBootApplication

@EnableEfficax
@EnableNonRestrictiveCorsPolicy
@SpringBootApplication
open class DepartmentServiceApplication

fun main(vararg args : String) = runApp(DepartmentServiceApplication::class, *args)
