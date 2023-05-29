package com.polylab.religion;

import com.jxareas.jxcore.annotations.EnableJxCore
import com.jxareas.jxcore.annotations.EnableNonRestrictiveCorsPolicy
import com.jxareas.jxcore.common.extensions.with
import org.springframework.boot.autoconfigure.SpringBootApplication

@EnableJxCore
@EnableNonRestrictiveCorsPolicy
@SpringBootApplication
open class ReligionServiceApplication

fun main(vararg args : String) = ReligionServiceApplication::class.with(*args)
