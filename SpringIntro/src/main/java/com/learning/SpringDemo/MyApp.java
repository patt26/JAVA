package com.learning.SpringDemo;

public class MyApp {
    public static void main(String[] args) {
        ICoach coach=new TrackCoach();
        System.out.println(coach.getDailyWorkout());
    }
}
