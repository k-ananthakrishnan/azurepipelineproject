package com.azurepipeline.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DemoController {

    @GetMapping("/greet")
    public String greet(){
        return "Hello World";
    }

    @GetMapping("/api1")
    public String api1(){
        return "API1 doing API things";
    }

    @GetMapping("/api2")
    public String api2(){
        return "API2 doing API things";
    }

    @GetMapping("/api3")
    public String api3(){
        return "API3 doing API things";
    }

    @GetMapping("/api4")
    public String api4(){
        return "API4 doing API things";
    }

    @GetMapping("/api5")
    public String api5(){
        return "API5 doing API things";
    }

}
