package com.springAnnotationDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class annotationAppDemo {

    public static void main(String[] args) {


        // retrive config file

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // get the beans from spring container

        ICoach tennis = context.getBean("tennisCoach", ICoach.class);
//        ICoach football=context.getBean("footBallCoach",ICoach.class);

        // get methods
        System.out.println(tennis.getWorkout());
        System.out.println(tennis.getFortune());
//        System.out.println(football.getWorkout());

    }
}
