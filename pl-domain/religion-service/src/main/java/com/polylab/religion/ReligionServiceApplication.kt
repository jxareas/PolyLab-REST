package com.polylab.religion;

import com.jxareas.efficax.annotations.EnableEfficax
import com.jxareas.efficax.annotations.EnableNonRestrictiveCorsPolicy
import com.jxareas.efficax.extensions.with
import org.springframework.boot.autoconfigure.SpringBootApplication

@EnableEfficax
@EnableNonRestrictiveCorsPolicy
@SpringBootApplication
open class ReligionServiceApplication

fun main(vararg args : String) = ReligionServiceApplication::class.with(*args)
