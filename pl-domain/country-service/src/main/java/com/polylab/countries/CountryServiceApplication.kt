package com.polylab.countries

import com.jxareas.jxcore.annotations.EnableJxCore
import com.jxareas.jxcore.annotations.EnableNonRestrictiveCorsPolicy
import com.jxareas.jxcore.common.extensions.with
import org.springframework.boot.autoconfigure.SpringBootApplication

@EnableJxCore
@EnableNonRestrictiveCorsPolicy
@SpringBootApplication
open class CountryServiceApplication

fun main(vararg args : String) = CountryServiceApplication::class.with(*args)


