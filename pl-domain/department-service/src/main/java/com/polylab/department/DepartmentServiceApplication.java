package com.polylab.department;

import com.jxareas.jxcore.annotations.EnableJxCore;
import com.jxareas.jxcore.annotations.EnableNonRestrictiveCorsPolicy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableJxCore
@EnableNonRestrictiveCorsPolicy
@SpringBootApplication
public class DepartmentServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DepartmentServiceApplication.class, args);
    }

}
