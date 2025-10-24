package com.example.checkTest2r;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserCntrl {

    @GetMapping("/user")
    public User getUser(){
        return new User("Ivan", 25, "ivanE@gmail.com");
    }

}
class User {
    private String name;
    private int age;
    private String email;

    public User(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getEmail(){
        return email;
    }
}