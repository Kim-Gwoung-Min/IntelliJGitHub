package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController{
    @GetMapping("/hi")
    public String niceToMeetYou(Model model ){
        model.addAttribute("username","광민");
        return "greetings"; //templates/ greetings.mustache -> 브라우저로 전송
    }
    @GetMapping("/bye")
    public String seeYouLater(Model model){
        model.addAttribute("username","apple1234");
        return "byebye";
    }
}
