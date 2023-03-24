package com.learning.springcoredemo.Model;

import com.learning.springcoredemo.Interface.ICoach;
import org.springframework.context.annotation.Configuration;


public class SwimCoach implements ICoach {


    @Override
    public String getDailyWorkout() {
        return "Swim 1k warmup";
    }

    @Override
    public String getFortune() {
        return null;
    }
}
