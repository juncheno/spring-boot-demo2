package com.test.example.springbootdemo2;

import javax.management.*;
import java.io.IOException;
import java.lang.management.ManagementFactory;

public class JMXMain {

    public static void main(String[] args) throws MalformedObjectNameException, NotCompliantMBeanException, InstanceAlreadyExistsException, MBeanRegistrationException, IOException {
        MBeanServer mBeanServer = ManagementFactory.getPlatformMBeanServer();
        ObjectName objectName=new ObjectName("com.test.example.springbootdemo2:type=SystemInfo");
        mBeanServer.registerMBean(new SystemInfo(),objectName);
        System.in.read();
    }
}
