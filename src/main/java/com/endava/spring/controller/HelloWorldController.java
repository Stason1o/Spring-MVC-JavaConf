package com.endava.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by sbogdanschi on 25/04/2017.
 */
@Controller
public class HelloWorldController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String helloWorld(ModelMap modelMap){
        return "index";
    }

}
