package com.stazman.generator_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:chuck-config.xml")
public class GeneratorAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(GeneratorAppApplication.class, args);
    }

}
