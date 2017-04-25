package com.endava.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by sbogdanschi on 25/04/2017.
 */
@Controller
public class HelloWorldController {

    @RequestMapping(value = "/")
    public String helloWorld(){
        return "helloWorld";
    }
}
