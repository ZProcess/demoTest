package anotation;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Aspect
@Service
public class LoggingAspect {
    @Pointcut("bean(helloService2)")
    public void helloTest(){};

    @Before("helloTest()")
    public void beforeMethod(){
        System.out.println("method start22222");
    }

    @After("helloTest()")
    public void afterMethod(){
        System.out.println("method end22222");
    }

}
