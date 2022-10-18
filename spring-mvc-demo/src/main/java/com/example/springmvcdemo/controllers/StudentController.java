package com.example.springmvcdemo.controllers;

import com.example.springmvcdemo.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Locale;

@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping("")
    public String studentPage(){

        return "studentPage";
    }

    @RequestMapping("/registration-form")
    public String showRegistrationForm(Model theModel){

        //1. Create a student object
        Student theStudent= new Student();
         //2.    add student object to the model
        theModel.addAttribute("student", theStudent);
        return "registerForm";
    }

    @RequestMapping("/processForm")
    public  String processForm(@ModelAttribute("student") Student theStudent){

        // process form data
        String fName= theStudent.getFirstName();
        theStudent.setFirstName(fName.toUpperCase(Locale.ROOT));

        // log the input data
        System.out.println("First Name: "+theStudent.getFirstName());
        System.out.println("Last Name: "+ theStudent.getLastName());
        System.out.println("Favorite Language: "+ theStudent.getFavoriteLanguage());
        return "student-confirmation";
    }
}
