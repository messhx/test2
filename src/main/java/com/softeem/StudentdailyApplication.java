package com.softeem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages="com.softeem.dao")
@SpringBootApplication
public class StudentdailyApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentdailyApplication.class, args);

    }

}
