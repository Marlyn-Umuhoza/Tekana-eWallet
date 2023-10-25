package ewallet.demo;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
public class MyApplication {

//    @RequestMapping("/")
//    String home() {
//        return "Connected to DB!";
//    }

    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
    }

}
