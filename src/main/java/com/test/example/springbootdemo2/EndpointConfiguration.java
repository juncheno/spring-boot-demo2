package com.test.example.springbootdemo2;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class EndpointConfiguration {

    @Bean
    public CostomerMetricsIndicator costomerMetricsIndicator(){
        return new CostomerMetricsIndicator();
    }
}
