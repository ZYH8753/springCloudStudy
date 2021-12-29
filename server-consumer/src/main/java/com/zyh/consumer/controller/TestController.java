package com.zyh.consumer.controller;

import com.zyh.consumer.entity.Order;
import com.zyh.consumer.feign.TestFeign;
import com.zyh.consumer.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping
@RefreshScope
public class TestController {
    @Autowired
    private OrderService orderService;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private TestFeign testFeign;

    @RequestMapping("/master")
    public String master() {
        orderService.insert(new Order(null,"1",1));
        return "ok";
    }

    @RequestMapping("/test")
    public String test() {
        return testFeign.test();
//        return restTemplate.getForObject("http://server-provider/test", String.class);
    }
}
