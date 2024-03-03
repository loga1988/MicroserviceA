package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ImportAutoConfiguration
@ComponentScan(basePackages = "org.example")
@EnableDiscoveryClient
public class MicroserviceMainApplication {
    public static void main(String[] args) {

        SpringApplication.run(MicroserviceMainApplication.class, args);
    }
}