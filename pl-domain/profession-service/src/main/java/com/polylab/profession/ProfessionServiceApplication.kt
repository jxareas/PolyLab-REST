package com.polylab.profession;

import com.jxareas.jxcore.annotations.EnableJxCore
import com.jxareas.jxcore.annotations.EnableNonRestrictiveCorsPolicy
import com.jxareas.jxcore.common.extensions.runApp
import org.springframework.boot.autoconfigure.SpringBootApplication

@EnableJxCore
@EnableNonRestrictiveCorsPolicy
@SpringBootApplication
open class ProfessionServiceApplication

fun main(vararg args : String) = runApp(ProfessionServiceApplication::class, *args)
