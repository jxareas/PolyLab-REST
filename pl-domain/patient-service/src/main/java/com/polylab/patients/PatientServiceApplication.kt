package com.polylab.patients;

import com.jxareas.efficax.annotations.EnableEfficax
import com.jxareas.efficax.annotations.EnableNonRestrictiveCorsPolicy
import com.jxareas.efficax.extensions.runApp
import org.springframework.boot.autoconfigure.SpringBootApplication

@EnableEfficax
@EnableNonRestrictiveCorsPolicy
@SpringBootApplication
open class PatientServiceApplication

fun main(vararg args : String) =  runApp(PatientServiceApplication::class, *args)
