package com.krloyar.springcore.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
public class TrackCoach implements Coach{

    TrackCoach(){
        System.out.println("Inside TrackCoach Constructor");
    }
    @Override
    public String getDailyWorkout() {
        return "Run For 200 mins";
    }
}
