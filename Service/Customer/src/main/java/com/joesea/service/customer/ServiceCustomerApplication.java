package com.joesea.service.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * <p>@author : Joesea Lea</p>
 * <p>@date : 2020/2/18</p>
 * <p>@description : </p>
 */
@SpringBootApplication
@EnableEurekaClient
public class ServiceCustomerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceCustomerApplication.class);
    }

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
