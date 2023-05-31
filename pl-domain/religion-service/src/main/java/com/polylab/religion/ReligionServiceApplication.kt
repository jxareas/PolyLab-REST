package com.polylab.religion;

import com.jxareas.jxelerator.annotations.EnableJxelerator
import com.jxareas.jxelerator.annotations.EnableNonRestrictiveCorsPolicy
import com.jxareas.jxelerator.extensions.with
import org.springframework.boot.autoconfigure.SpringBootApplication

@EnableJxelerator
@EnableNonRestrictiveCorsPolicy
@SpringBootApplication
open class ReligionServiceApplication

fun main(vararg args : String) = ReligionServiceApplication::class.with(*args)
