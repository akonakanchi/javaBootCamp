package app01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name,int age){};
record Address(String address_Line1, int zipCode, String city){};
@Configuration
public class ConfigurationClass {

    @Bean
    public String name(){
        return "name";
    }
    @Bean
     public int age() {
        return 21;
    }
    @Bean
    Person person(){
        return new Person(name(),age());
    }

    @Bean
    Address address(){
        return new Address("123 street",123456, "lansing");
    }

}
