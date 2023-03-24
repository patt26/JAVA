package com.learning.springcoredemo.Controller;

import com.learning.springcoredemo.Interface.ICoach;
import com.learning.springcoredemo.Interface.IFortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private ICoach coach;
    private ICoach anotherCoach;


    // Constructor injection
  /*  @Autowired
    public DemoController(@Qualifier("baseBallCoach") ICoach iCoach,    { here we used for prototype scope }
                          @Qualifier("baseBallCoach") ICoach ac){
        coach=iCoach;
        anotherCoach=ac;
        System.out.println("In constructor: "+getClass().getSimpleName());
    }*/

    @Autowired
    public DemoController(@Qualifier("aquatic") ICoach iCoach){
        coach=iCoach;
    }

    @GetMapping("/")
    public String helloProg(){
        return "Hello Coach";
    }

    @GetMapping("/workout")
    public String getWorkout(){
        return coach.getDailyWorkout();

    }

    @GetMapping("/fortune")
    public String getDailyFortune(){
       return coach.getFortune();
    }

    @GetMapping("/check")
    public String check(){
        return "Return the result of scope "+(coach==anotherCoach);
    }

}
