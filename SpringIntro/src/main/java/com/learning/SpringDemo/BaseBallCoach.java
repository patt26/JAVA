package com.learning.SpringDemo;

import org.springframework.stereotype.Component;


public class BaseBallCoach implements ICoach {
    // define private field
    IFortune fortune;

    // Create Constructor

    public BaseBallCoach(IFortune iFortune){
        fortune=iFortune;
    }


    public String getDailyWorkout(){
        return "Spend 30 minutes in workout";
    }

    @Override
    public String getFortune() {
        return fortune.getFortune();
    }


}
