package com.example.first_thyme.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

    private List<String> messages = new ArrayList<>();

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home(Model model){
        model.addAttribute("greeting", "Hello Thymeleaf");
        return "home";
    }

    @RequestMapping(value = "/home/message", method = RequestMethod.GET)
    public String showMessagePage(Model model){
        model.addAttribute("messages", messages);

        return "messages";
    }

    @RequestMapping(value = "/home/message", method = RequestMethod.POST)
    public String addString(@RequestParam(value = "message", required = false) String message){

        messages.add(message);

        return "redirect:/home/message";
    }






}
