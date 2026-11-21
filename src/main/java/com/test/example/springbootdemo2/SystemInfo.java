package com.test.example.springbootdemo2;

public class SystemInfo implements SystemInfoMBean {
    @Override
    public int getCpu() {
        return Runtime.getRuntime().availableProcessors();
    }

    @Override
    public long totalMemory() {
        return Runtime.getRuntime().totalMemory();
    }

    @Override
    public void shutDown() {
        System.exit(0);
    }
}
