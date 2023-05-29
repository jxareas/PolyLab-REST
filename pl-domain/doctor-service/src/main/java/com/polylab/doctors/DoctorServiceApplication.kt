package com.polylab.doctors;

import com.jxareas.jxcore.annotations.EnableJxCore
import com.jxareas.jxcore.annotations.EnableNonRestrictiveCorsPolicy
import com.jxareas.jxcore.common.extensions.runApp
import org.springframework.boot.autoconfigure.SpringBootApplication

@EnableNonRestrictiveCorsPolicy
@EnableJxCore
@SpringBootApplication
open class DoctorServiceApplication

fun main(vararg args: String) = runApp(DoctorServiceApplication::class, *args)
