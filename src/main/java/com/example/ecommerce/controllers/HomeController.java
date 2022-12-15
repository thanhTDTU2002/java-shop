package com.example.ecommerce.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @GetMapping
    public ModelAndView index(Model model) {
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("welcome", "Welcome to Spring Boot");
        return mav;
//        model.addAttribute("welcome", "Welcome to Spring Boot");
//        return "index";
    }
}
