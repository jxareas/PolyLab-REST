package com.polylab.department

import com.jxareas.jxcore.annotations.EnableJxCore
import com.jxareas.jxcore.annotations.EnableNonRestrictiveCorsPolicy
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@EnableJxCore
@EnableNonRestrictiveCorsPolicy
@SpringBootApplication
open class DepartmentServiceApplication

fun main(args: Array<String>) {
    SpringApplication.run(DepartmentServiceApplication::class.java, *args)
}
