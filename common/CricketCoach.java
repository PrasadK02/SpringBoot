package com.krloyar.springcore.common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

    CricketCoach(){
        System.out.println("Inside CricketCoach Constructor");
    }
    @Override
    public String getDailyWorkout() {
        return "Practice Bowling for 100 mins";
    }
}
