package com.springAnnotationDemo;

import org.springframework.stereotype.Component;

@Component
public class FootBallCoach implements ICoach{
    @Override
    public String getWorkout() {
        return "Practice for Defence";
    }

    @Override
    public String getFortune() {
        return null;
    }
}
