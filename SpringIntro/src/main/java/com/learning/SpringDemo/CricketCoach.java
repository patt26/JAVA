package com.learning.SpringDemo;

public class CricketCoach implements ICoach{
   private IFortune ifortune;

   // Add new fields for email and Team

    private String emailAddress;
    private String name;

    // setting setter methods for fields


    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getName() {
        return name;
    }

    public CricketCoach(){
       System.out.println("No arg constructor called");
   }

    public void setFortune(IFortune ifortune) {
        this.ifortune = ifortune;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice daily for atleast 5 overs";
    }

    @Override
    public String getFortune() {
        return ifortune.getFortune();
    }


}
