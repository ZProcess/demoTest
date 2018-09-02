package anotation;

import com.HelloService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringStart {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("application.xml");
        HelloService2 helloService=context.getBean("helloService2",HelloService2.class);
        helloService.sayHello("zjc");
    }
}
