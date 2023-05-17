package com.jxareas.jxcore

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
import org.springframework.boot.runApplication

@SpringBootApplication(exclude = [DataSourceAutoConfiguration::class])
class JxCoreApplication

fun main(args: Array<String>) {
    runApplication<JxCoreApplication>(*args)
}
