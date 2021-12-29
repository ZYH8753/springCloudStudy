package com.zyh.consumer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@FeignClient(name = "server-provider", )
public interface TestFeign {
    @RequestMapping("/test")
    String test();
}
