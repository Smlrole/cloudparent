package qingqing.hedan.cn.controller;

import com.netflix.appinfo.EurekaInstanceConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloEndpoint {

    @Autowired
    private EurekaInstanceConfig eurekaInstanceConfig;

    private int serverPost = 0;

    @RequestMapping("/hello")
    public String hello(){
        return "Hello, Spring Cloud!" + String.valueOf(serverPost);
    }
}
