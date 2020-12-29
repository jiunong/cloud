package com.sict.cloud.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableDiscoveryClient
@SpringBootApplication
@EnableTransactionManagement
@MapperScan(basePackages = "com.sict.cloud.user.dao")
@EnableFeignClients
@EnableHystrix
public class CloudProviderUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudProviderUserApplication.class, args);
    }

}
