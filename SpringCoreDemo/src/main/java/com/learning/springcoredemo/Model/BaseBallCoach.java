package com.learning.springcoredemo.Model;

import com.learning.springcoredemo.Interface.ICoach;
import com.learning.springcoredemo.Service.HappyFortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BaseBallCoach implements ICoach {
    // field Injection though not recomended
//    @Autowired
//    private HappyFortuneService hp;
    @Override
    public String getDailyWorkout() {
        return "Hit 5 Bases per day";
    }

    @Override
    public String getFortune() {
        return "Just Do it, Batter";
    }

    public BaseBallCoach() {
        System.out.println("In constructor: "+getClass().getSimpleName());
    }

}
