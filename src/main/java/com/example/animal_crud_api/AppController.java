package com.example.animal_crud_api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class AppController {

    @GetMapping({"", "/", "/home"})
    public String redirectToAnimals() {
        return "redirect:/animals";
    }
    
}
