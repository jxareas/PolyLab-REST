package com.polylab.doctors;

import com.jxareas.jxelerator.annotations.EnableJxelerator
import com.jxareas.jxelerator.annotations.EnableNonRestrictiveCorsPolicy
import com.jxareas.jxelerator.extensions.runApp
import org.springframework.boot.autoconfigure.SpringBootApplication

@EnableNonRestrictiveCorsPolicy
@EnableJxelerator
@SpringBootApplication
open class DoctorServiceApplication

fun main(vararg args: String) = runApp(DoctorServiceApplication::class, *args)
