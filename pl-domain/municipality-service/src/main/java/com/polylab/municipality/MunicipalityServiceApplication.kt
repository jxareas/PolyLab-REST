package com.polylab.municipality;

import com.jxareas.jxelerator.annotations.EnableJxelerator
import com.jxareas.jxelerator.annotations.EnableNonRestrictiveCorsPolicy
import com.jxareas.jxelerator.extensions.runApp
import org.springframework.boot.autoconfigure.SpringBootApplication

@EnableJxelerator
@EnableNonRestrictiveCorsPolicy
@SpringBootApplication
open class MunicipalityServiceApplication

fun main(vararg args : String) = runApp(MunicipalityServiceApplication::class, *args)
