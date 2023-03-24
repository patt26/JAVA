package PracticeProblems;

import java.util.Random;

public class FortuneRetriver implements IFortune{
    Random random=new Random();
    String [] randomString=new String[]{"Have a Good Day","Just Go for it","You can do it"};
    @Override
    public String getFortune() {
       int checker=random.nextInt(3);
      return randomString[checker];
    }
}
