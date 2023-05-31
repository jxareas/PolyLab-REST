package com.polylab.countries

import com.jxareas.jxelerate.annotations.EnableJxelerate
import com.jxareas.jxelerate.annotations.EnableNonRestrictiveCorsPolicy
import com.jxareas.jxelerate.common.extensions.with
import org.springframework.boot.autoconfigure.SpringBootApplication

@EnableJxelerate
@EnableNonRestrictiveCorsPolicy
@SpringBootApplication
open class CountryServiceApplication

fun main(vararg args : String) = CountryServiceApplication::class.with(*args)


