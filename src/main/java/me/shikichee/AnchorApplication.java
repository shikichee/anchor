package me.shikichee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AnchorApplication {

    public static void main(String[] args) {
        String test = null;
        if(test!=null){
            System.out.println("test");
        }
        if (true) {if (false) {}}
        
        SpringApplication.run(AnchorApplication.class, args);
    }
}
