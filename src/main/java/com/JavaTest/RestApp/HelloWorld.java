package com.JavaTest.RestApp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//grabs data from org.springframework.web.bind.annotation onto my page through the @RestController annotation

@RestController
public class HelloWorld {

    //Whatever data gets sent back will be routed to the home page of the page through “/”

    @RequestMapping("/")
    public String index() {
        // Since we have a return statement, we aren't super sure how to put more stuff on the page beyond concatenating statements
        return "Java can die in a fire." + " " + "I would prefer not to get a Java job at this time.";
    }
}