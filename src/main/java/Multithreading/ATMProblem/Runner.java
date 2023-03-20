package Multithreading.ATMProblem;

public class Runner {
    public static void main(String[] args) throws InterruptedException {
        ATM atm =new ATM();
        Customer c1=new Customer(atm,"Jhon",8900);
        Customer c2=new Customer(atm,"Smith",7400);
        c1.start();
        c2.start();



    }
}
