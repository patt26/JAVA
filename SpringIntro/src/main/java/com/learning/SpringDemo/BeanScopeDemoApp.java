package com.learning.SpringDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main(String[] args) {

        // Load the spring Config file
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        // Retrive the beans from Spring container
        ICoach coach=context.getBean("myCoach",ICoach.class);
        ICoach alphaCoach=context.getBean("myCoach",ICoach.class);

        // see if both objects pointing at a same  ref or not

        boolean result=(coach==alphaCoach);

        System.out.println(result+"\n"+coach+"\n"+alphaCoach);
    }
}
