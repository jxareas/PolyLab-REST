package com.polylab.patients;

import com.jxareas.jxelerate.annotations.EnableJxelerate
import com.jxareas.jxelerate.annotations.EnableNonRestrictiveCorsPolicy
import com.jxareas.jxelerate.common.extensions.runApp
import org.springframework.boot.autoconfigure.SpringBootApplication

@EnableJxelerate
@EnableNonRestrictiveCorsPolicy
@SpringBootApplication
open class PatientServiceApplication

fun main(vararg args : String) =  runApp(PatientServiceApplication::class, *args)
