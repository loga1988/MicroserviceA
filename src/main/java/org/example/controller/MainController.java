package org.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee/info")
public class MainController {
    @GetMapping("/{user}")
    public String getEmployee(@PathVariable("user") String user){
        return "Welcome "+user;
    }
}
