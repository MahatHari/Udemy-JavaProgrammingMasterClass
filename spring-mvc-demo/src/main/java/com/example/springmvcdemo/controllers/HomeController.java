package com.example.springmvcdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    //2. Controller Method
    @RequestMapping(value = "/", method = RequestMethod.GET) //3. Adding request Mapping
    public String showPage(){
        return "main-menu";
    }
}
