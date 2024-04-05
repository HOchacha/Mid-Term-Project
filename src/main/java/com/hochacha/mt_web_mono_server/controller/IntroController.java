package com.hochacha.mt_web_mono_server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IntroController {
    @GetMapping("/")
    public ModelAndView intro() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("intro");
        modelAndView.addObject("name", "John Doe");
        modelAndView.addObject("description", "A passionate software developer...");
        return modelAndView;
    }
}