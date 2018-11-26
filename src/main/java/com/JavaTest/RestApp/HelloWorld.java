package com.JavaTest.RestApp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//grabs data from org.springframework.web.bind.annotation onto my page through the @RestController annotation

@RestController
public class HelloWorld {

    //Whatever data gets sent back will be routed to the home page of the page through “/”

    @RequestMapping("/")
    public String index() {
        return "Java can die in a fire";
    }
}