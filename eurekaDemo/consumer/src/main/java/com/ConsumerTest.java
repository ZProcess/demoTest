package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerTest {
    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/consumer")
    public String doConsumer(){
        return restTemplate.getForEntity("http://client-test/hello",String.class).getBody();
    }
}
