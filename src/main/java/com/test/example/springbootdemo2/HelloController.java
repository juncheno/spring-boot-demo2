package com.test.example.springbootdemo2;


import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.ZooKeeper;
import org.apache.zookeeper.data.Stat;
//import org.redisson.api.RBucket;
//import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

//    @Autowired
//    public RedissonClient redissonClient;

    @Autowired
    private ObjectFactory<ZooKeeper> zooKeeperFc;


//    @GetMapping("/test")
//    public String hello(){
//        RBucket<String > bucket= redissonClient.getBucket("name");
//        if (bucket.get()==null){
//            bucket.set("com.test.cj1");
//        }
//        return bucket.get();
//    }

    @GetMapping("/testzk")
    public String connectzk(@RequestParam String node){
        String result="";
        try {
            ZooKeeper zooKeeper=zooKeeperFc.getObject();
            result  =new String(zooKeeper.getData("/"+node,false,new Stat()));
        } catch (KeeperException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return result;
    }


}
