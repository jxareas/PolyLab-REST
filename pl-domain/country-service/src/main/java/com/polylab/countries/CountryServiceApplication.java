package com.polylab.countries;

import com.jxareas.jxcore.common.annotations.EnableJxCore;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableJxCore
@SpringBootApplication
public class CountryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CountryServiceApplication.class, args);
    }

}
