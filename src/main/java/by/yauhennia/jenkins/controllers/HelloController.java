package by.yauhennia.jenkins.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HelloController {

    @GetMapping("/hello")
    public String helloPage() {
        return "hello";
    }

}
