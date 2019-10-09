package qingqing.hedan.cn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("helllo")
    public String hello(){
        return restTemplate.getForEntity("http://SERVICE-HELLO/hello", String.class).getBody();
    }
}
