package com.learning.springcoredemo.Model;

import com.learning.springcoredemo.Interface.ICoach;
import com.learning.springcoredemo.Interface.IFortuneService;
import com.learning.springcoredemo.Service.HappyFortuneService;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements ICoach {
    private IFortuneService fortuneService;
//    private HappyFortuneService hp;


    public CricketCoach() {
        System.out.println("In constructor: "+getClass().getSimpleName());
    }

    // setter injection
    @Autowired
    public void setFortuneService(IFortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

   /* @Autowired
    public void setHp(HappyFortuneService hp) {
        this.hp = hp;
    }*/

    @Override
    public String getDailyWorkout() {
        return "Practice for Fast Bowling";
    }

    @Override
    public String getFortune() {
        return fortuneService.getFortune();
    }

    @PostConstruct
   public void doMyStartup(){
        System.out.println( "Start up stuff");
   }

   @PreDestroy
   public void doMyEndStuff(){
       System.out.println( "This is end stuff");
   }


}
