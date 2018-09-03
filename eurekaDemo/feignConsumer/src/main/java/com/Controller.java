package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    FeignCall feignCall;

   @RequestMapping("/feign")
    public String feignResult(){
       return feignCall.doIt();
   }
}
