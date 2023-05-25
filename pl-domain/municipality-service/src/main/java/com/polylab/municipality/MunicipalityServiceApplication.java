package com.polylab.municipality;

import com.jxareas.jxcore.annotations.EnableJxCore;
import com.jxareas.jxcore.annotations.EnableNonRestrictiveCorsPolicy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableJxCore
@EnableNonRestrictiveCorsPolicy
@SpringBootApplication
public class MunicipalityServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MunicipalityServiceApplication.class, args);
    }

}
