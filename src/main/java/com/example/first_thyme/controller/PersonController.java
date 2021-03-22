package com.example.first_thyme.controller;

import com.example.first_thyme.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Controller
public class PersonController {

    List<Person> personList = new ArrayList<>();

    @GetMapping("/person")
    public String getAllPerson(Model model){
        model.addAttribute("people", personList);
        return "people_view";
    }

    @GetMapping("/person/form")
    public String showPersonForm(){
        return "register";
    }

    @PostMapping("/person/process")
    public String processForm(String username, String password, String passwordRepeat, String name){
        Person person = new Person(
                UUID.randomUUID().toString(),
                password,
                username,
                name
        );

        personList.add(person);

        return "redirect:/person";
    }

}
