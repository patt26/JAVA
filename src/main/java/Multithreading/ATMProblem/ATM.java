package Multithreading.ATMProblem;

public class ATM {

    synchronized public void checkBalance(String name)  {
        System.out.print(name+" is checking");
       try{ Thread.sleep(1000);}catch (Exception e){
           System.out.println(e);
       }
        System.out.println(" balance");
    }
    synchronized public void withdrawAmount(String name, float amount) {
        System.out.print(name+" is withdrawing amount of Rs ");
        try {
            Thread.sleep(1000);
            System.out.println(amount);
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

    }

}
