package com.polylab.patients;

import com.jxareas.jxcore.annotations.EnableJxCore
import com.jxareas.jxcore.annotations.EnableNonRestrictiveCorsPolicy
import com.jxareas.jxcore.common.extensions.runApp
import org.springframework.boot.autoconfigure.SpringBootApplication

@EnableJxCore
@EnableNonRestrictiveCorsPolicy
@SpringBootApplication
open class PatientServiceApplication

fun main(vararg args : String) =  runApp(PatientServiceApplication::class, *args)
