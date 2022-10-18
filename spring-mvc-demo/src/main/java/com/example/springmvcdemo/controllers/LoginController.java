package com.example.springmvcdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.Locale;

@Controller
public class LoginController {


        @RequestMapping(value = "/login", method = RequestMethod.GET)
        public String showLoginPage(){
            return "login";
        }
        @RequestMapping(value = "/processForm", method = RequestMethod.GET)
        public String showProcessForm(){
            return "processForm";
        }

        // new controller method to read form data and
    // add data to the model
    @RequestMapping("/processFormVersionTwo")
    public String letsShoutDude(HttpServletRequest request, Model model){

            // read the request parameter from the html form
        String theName= request.getParameter("studentName");

        // convert the data to all caps
        theName=theName.toUpperCase(Locale.ROOT);
        // create the message
        String result= "Yo " + theName+ "!!!";

        // add message to the model
        model.addAttribute("message", result);

        // return view page that contains attribute, message
            return "processForm";
    }
    // new controller method to read form data using @RequestParam annotations
    // add data to the model
    @RequestMapping("/processFormVersionThree")
    public String processFormVersionThree(@RequestParam("studentName") String theName, Model model){

        // convert the data to all caps
         theName=theName.toUpperCase(Locale.ROOT);
        // create the message
        String result= "Hey My Friend from V3 ! " + theName+ "!!!";

        // add message to the model
        model.addAttribute("message", result);

        // return view page that contains attribute, message
        return "processForm";
    }

}
