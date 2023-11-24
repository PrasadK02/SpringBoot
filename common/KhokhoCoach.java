package com.krloyar.springcore.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

// @Primary
@Component
public class KhokhoCoach implements Coach{
    KhokhoCoach(){
        System.out.println("Inside KhokhoCoach Constructor");
    }
    @Override
    public String getDailyWorkout() {
        return "Run For Your Life";
    }
}
