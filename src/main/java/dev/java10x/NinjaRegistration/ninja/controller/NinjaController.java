package dev.java10x.NinjaRegistration.ninja.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome, this is my first message in this route";
    }
}
