package com.polylab.countries

import com.jxareas.jxelerator.annotations.EnableJxelerator
import com.jxareas.jxelerator.annotations.EnableNonRestrictiveCorsPolicy
import com.jxareas.jxelerator.extensions.with
import org.springframework.boot.autoconfigure.SpringBootApplication

@EnableJxelerator
@EnableNonRestrictiveCorsPolicy
@SpringBootApplication
open class CountryServiceApplication

fun main(vararg args : String) = CountryServiceApplication::class.with(*args)
