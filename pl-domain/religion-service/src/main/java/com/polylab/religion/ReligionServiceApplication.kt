package com.polylab.religion;

import com.jxareas.jxelerate.annotations.EnableJxelerate
import com.jxareas.jxelerate.annotations.EnableNonRestrictiveCorsPolicy
import com.jxareas.jxelerate.common.extensions.with
import org.springframework.boot.autoconfigure.SpringBootApplication

@EnableJxelerate
@EnableNonRestrictiveCorsPolicy
@SpringBootApplication
open class ReligionServiceApplication

fun main(vararg args : String) = ReligionServiceApplication::class.with(*args)
