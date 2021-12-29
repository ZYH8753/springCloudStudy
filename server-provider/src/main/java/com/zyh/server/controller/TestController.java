package com.zyh.server.controller;

import com.zyh.server.entity.Order;
import com.zyh.server.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@RefreshScope
public class TestController {
    @Autowired
    private OrderService orderService;

    @Value("${user.name}")
    String userName;

    @RequestMapping("/master")
    public String master() {
        orderService.insert(new Order(null,"1",1));
        return "ok";
    }

    @RequestMapping("/test")
    public String test() {
        System.out.println("test:" + userName);
        return userName;
    }
}
