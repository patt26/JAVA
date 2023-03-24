package PracticeProblems;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoApp {
    public static void main(String[] args) {


        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("demoPractice.xml");

        IFortune fort = context.getBean("fortuneRetriever", IFortune.class);

        System.out.println(fort.getFortune());

    }
}
