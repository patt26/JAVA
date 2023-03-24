package com.learning.SpringDemo;

public class TrackCoach implements ICoach{

   private IFortune iFortune;

   public TrackCoach(){}

   public TrackCoach(IFortune fortune){
       iFortune=fortune;
   }

    @Override
    public String getDailyWorkout() {
        return "Run Atleast 8k ";
    }

    @Override
    public String getFortune() {
        return "Go For it "+ iFortune.getFortune();
    }

    public void startUpMethod(){
        System.out.println("Start up method for startUpMethod");
    }
    public void destroyMethod(){
        System.out.println("Destroy method for destroyMethod");
    }


}
