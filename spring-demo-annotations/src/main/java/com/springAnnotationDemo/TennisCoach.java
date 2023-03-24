package com.springAnnotationDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements ICoach{
   private IFortuneService iFortuneService;

   @Autowired
    public TennisCoach(IFortuneService iFortuneService) {
        this.iFortuneService = iFortuneService;
    }

    public String getWorkout() {
        return "Practice Tennis for 30 minutes";
    }

    @Override
    public String getFortune() {
        return iFortuneService.getFortune();
    }
}
