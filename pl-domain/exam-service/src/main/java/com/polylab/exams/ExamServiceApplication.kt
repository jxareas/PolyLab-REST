package com.polylab.exams;

import com.jxareas.jxelerate.annotations.EnableJxelerate
import com.jxareas.jxelerate.annotations.EnableNonRestrictiveCorsPolicy
import com.jxareas.jxelerate.common.extensions.runApp
import org.springframework.boot.autoconfigure.SpringBootApplication

@EnableJxelerate
@EnableNonRestrictiveCorsPolicy
@SpringBootApplication
open class ExamServiceApplication
fun main(vararg args : String) = runApp(ExamServiceApplication::class, *args)
