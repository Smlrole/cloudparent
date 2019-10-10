package qingqing.hedan.cn.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import qingqing.hedan.cn.DemoService;

@RestController
@RequestMapping("/springboot")
public class TestController {
    @Reference
    private DemoService demoService;

    @RequestMapping(value = "/abc/test", method = RequestMethod.GET)
    public String sayhello(String name){
        return demoService.sayHello(name);
    }

}
