package com.learning.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.util.FileCopyUtils;
import org.springframework.util.ResourceUtils;

public class SpringHelloApp {
    public static void main(String[] args) {

        // load spring config

        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve the bean from spring container
        ICoach coach=context.getBean("baseBall",ICoach.class);
        ICoach cric=context.getBean("myCoach",ICoach.class);
        ICoach crik=context.getBean("crickCoach",ICoach.class);

        // call the  method
        System.out.println(coach.getDailyWorkout());
//       System.out.println(crik.getDailyWorkout());

        //calling new method for fortunes
//        System.out.println(coach.getFortune());
//        System.out.println(cric.getFortune());


        //close the context
        context.close();
    }
}
