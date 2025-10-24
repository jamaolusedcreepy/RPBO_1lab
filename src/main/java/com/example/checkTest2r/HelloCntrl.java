package com.example.checkTest2r;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloCntrl {
    @GetMapping("/hello")
    public String sayHello(){
        return "Hello word";
    }
}
