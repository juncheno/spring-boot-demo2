package com.test.example.springbootdemo2;


import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Endpoint(id="customer")
@Component
public class CostomerMetricsIndicator {

    @ReadOperation()
    public Map<String,String> time(){
        Map<String ,String> result
                =new HashMap<>();
        Date date = new Date();
        result.put("time",date.toString());
        return result;
    }
}
