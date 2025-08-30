package com.github.payment;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@Slf4j
@EnableConfigurationProperties
public class PaymentDemoApplication {

    public static void main(String[] args) {
        log.info("server is running- port 8090");
        SpringApplication.run(PaymentDemoApplication.class, args);
    }

}
