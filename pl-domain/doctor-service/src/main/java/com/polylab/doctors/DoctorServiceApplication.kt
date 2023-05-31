package com.polylab.doctors;

import com.jxareas.jxelerate.annotations.EnableJxelerate
import com.jxareas.jxelerate.annotations.EnableNonRestrictiveCorsPolicy
import com.jxareas.jxelerate.common.extensions.runApp
import org.springframework.boot.autoconfigure.SpringBootApplication

@EnableNonRestrictiveCorsPolicy
@EnableJxelerate
@SpringBootApplication
open class DoctorServiceApplication

fun main(vararg args: String) = runApp(DoctorServiceApplication::class, *args)
