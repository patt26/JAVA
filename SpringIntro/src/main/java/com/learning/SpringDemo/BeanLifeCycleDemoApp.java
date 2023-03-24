package com.learning.SpringDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {
    public static void main(String[] args) {

        // Load the spring Config file
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");

        // Retrive the beans from Spring container
        ICoach coach=context.getBean("myCoach",ICoach.class);

        System.out.println(coach.getDailyWorkout());
        context.close();
    }
}
