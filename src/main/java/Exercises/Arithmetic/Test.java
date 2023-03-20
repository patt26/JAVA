package Exercises.Arithmetic;

import ExcepptionPrac.ExceptionChallenge.StackUnderFlowException;

public class Test {
     Test(){
        System.out.println("Private Constructor");
    }
    protected void Display(){
        System.out.println("Display metthod of Test class");



    }
}
class Test2 extends Test{


    protected void DisplayOfTest2(){
        System.out.println("Display method of Test2 class ");

    }


    }

class Test3 extends Test4{
    public static void main(String[] args) throws Exception {



    }
    public void watch(){
        System.out.println("Hello");
    }
}
abstract class Test4{
     public void Watch(){}
   abstract protected void watch();
}
final class Test78 extends Test4 implements Test5 {

   public void watch(){
       System.out.println("3");
    }
}
interface Test5{
    int f=4;
    int a=3;

}



