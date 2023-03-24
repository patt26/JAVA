package com.learning.SpringDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
    public static void main(String[] args) {

        // load spring config
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrive bean from spring container
        CricketCoach crick=context.getBean("crickCoach",CricketCoach.class);

        // call methods
        System.out.println(crick.getFortune()+"\n"+crick.getDailyWorkout());

        // call our new variable injectors

       ;
        System.out.println(crick.getEmailAddress());
        System.out.println(crick.getName());
    }
}
