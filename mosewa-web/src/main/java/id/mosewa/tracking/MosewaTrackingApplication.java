package id.mosewa.tracking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class MosewaTrackingApplication {

    public static void main(String[] args) {
        SpringApplication.run(MosewaTrackingApplication.class, args);
    }
    
    //add something usless here
    
}
