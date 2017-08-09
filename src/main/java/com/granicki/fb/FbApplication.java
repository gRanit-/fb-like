package com.granicki.fb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.HashSet;
import java.util.concurrent.Executors;

import static java.lang.Thread.sleep;

@SpringBootApplication(exclude = org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration.class)

@ComponentScan
public class FbApplication {

    public static void main(String[] args) {

        SpringApplication.run(FbApplication.class, args);



    }
}
