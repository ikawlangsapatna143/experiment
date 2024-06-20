package com.pioneers.co.experiment.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleControllers {
    
    @GetMapping("/hello-world")
    public String helloWorld(){
        return "helloworld";
    }
}
