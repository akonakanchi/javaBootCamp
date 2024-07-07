package springBootApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearnSpringBootApp {

    public static void main(String[] args) {
        var v1 = SpringApplication.run(LearnSpringBootApp.class,args);
        System.out.println("*************************************");
        System.out.println(v1.getBeanDefinitionNames());
    }
}
