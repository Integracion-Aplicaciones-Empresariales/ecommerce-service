package com.ecommerce.service;

import com.ecommerce.service.config.FileStorageProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({FileStorageProperties.class})
public class ProjectEcommerceServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProjectEcommerceServiceApplication.class, args);
    }

}
