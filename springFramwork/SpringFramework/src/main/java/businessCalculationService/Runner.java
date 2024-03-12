package businessCalculationService;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@ComponentScan
public class Runner {

//    public static void main(String[] args) {
//        try(var context = new AnnotationConfigApplicationContext(Runner.class)){
//            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
//            System.out.println(
//            context.getBean(BusinessCalculationService.class).findMax());
//        }
//    }
}
