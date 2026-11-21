package com.test.example.springbootdemo2;

public interface SystemInfoMBean {

    int getCpu();

    long totalMemory();

    void shutDown();

}
