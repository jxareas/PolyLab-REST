package com.polylab.doctors;

import com.jxareas.efficax.annotations.EnableEfficax
import com.jxareas.efficax.annotations.EnableNonRestrictiveCorsPolicy
import com.jxareas.efficax.extensions.runApp
import org.springframework.boot.autoconfigure.SpringBootApplication

@EnableNonRestrictiveCorsPolicy
@EnableEfficax
@SpringBootApplication
open class DoctorServiceApplication

fun main(vararg args: String) = runApp(DoctorServiceApplication::class, *args)
