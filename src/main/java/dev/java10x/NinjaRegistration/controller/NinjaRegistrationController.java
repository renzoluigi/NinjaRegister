package dev.java10x.NinjaRegistration.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class NinjaRegistrationController {

    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome, this is my first message in this route";
    }
}
