package com.test.example.springbootdemo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService2 {
    @Autowired
    private TestService1 testService1;

    public void test2() {
        System.out.println("------");
    }

    public void test3() {
        System.out.println("----JJJJ--");
    }


}
