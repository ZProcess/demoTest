package com;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "client-test",configuration = FeignConfig.class)
public interface FeignCall {

    @RequestMapping("/hello")
    public String doIt();
}
