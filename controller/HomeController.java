package com.krloyar.springcore.controller;

import com.krloyar.springcore.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @Qualifier("cricketCoach")
    @Autowired
    Coach  theCoach;

    @GetMapping("/hello")
    public String sayHello(){
        return null;
    }

    @GetMapping("/cricket")
    public String vada(){

        return theCoach.getDailyWorkout();
    }

    @GetMapping("/aish")
    public String Aishwarya(){
        return "Aishwarya is Miss World";
    }
}
