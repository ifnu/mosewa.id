package id.mosewa.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class MosewaWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(MosewaWebApplication.class, args);
    }
    
}
