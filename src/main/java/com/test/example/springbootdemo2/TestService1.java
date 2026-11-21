package com.test.example.springbootdemo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class TestService1 {
    @Autowired
    private TestService2 testService2;

    @Async
    public void test1() {
        testService2.test3();
    }

    public void ddd(){
        testService2.test2();
    }

//    讲的很清楚。TestService6那个图有点小问题，第三列从第三格开始应该是这样的吧:TestService6依赖注入成功->
//    TestService6初始化完成->TestService6添加到一级缓存->TestService2依赖注入成功->..
}
