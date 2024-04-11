package com.hochacha.mt_web_mono_server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IntroController {
    @GetMapping("")
    public String index(){
        return "index";
    }
}