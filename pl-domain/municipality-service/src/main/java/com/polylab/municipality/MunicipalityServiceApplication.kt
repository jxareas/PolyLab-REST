package com.polylab.municipality;

import com.jxareas.jxcore.annotations.EnableJxCore
import com.jxareas.jxcore.annotations.EnableNonRestrictiveCorsPolicy
import com.jxareas.jxcore.common.extensions.runApp
import org.springframework.boot.autoconfigure.SpringBootApplication

@EnableJxCore
@EnableNonRestrictiveCorsPolicy
@SpringBootApplication
open class MunicipalityServiceApplication

fun main(vararg args : String) = runApp(MunicipalityServiceApplication::class, *args)
