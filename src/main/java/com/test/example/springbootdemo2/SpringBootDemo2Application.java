package com.test.example.springbootdemo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication(scanBasePackages = "com.test.example.springbootdemo2")
public class SpringBootDemo2Application {

    public static void main(String[] args) {

        ApplicationContext context=SpringApplication.run(SpringBootDemo2Application.class, args);
//        TestService1 testService1= (TestService1) context.getBean("testService1");
//        testService1.ddd();
//        testService1.test1();
//        TestService2 testService2= (TestService2) context.getBean("testService2");
//        mybatis 用了factorybean
    }

}
