package com.polylab.countries

import com.jxareas.jxcore.annotations.EnableJxCore
import com.jxareas.jxcore.annotations.EnableNonRestrictiveCorsPolicy
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@EnableJxCore
@EnableNonRestrictiveCorsPolicy
@SpringBootApplication
open class CountryServiceApplication

fun main(args: Array<String>) {
    SpringApplication.run(CountryServiceApplication::class.java, *args)
}


