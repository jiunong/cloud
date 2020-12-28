package com.sict.cloud.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class CloudProviderUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudProviderUserApplication.class, args);
    }

}
