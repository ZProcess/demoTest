package anotation;

import org.springframework.stereotype.Service;

import java.util.Date;

@Service("helloService2")
public class HelloServiceImpl2 implements HelloService2 {
    public void sayHello(String msg) {
        System.out.println(msg+new Date().toString());
    }
}
