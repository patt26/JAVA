package Multithreading.ATMProblem;

public class Customer extends Thread {
    Customer cust;
    ATM atm1;
    String name;
    float amount;


    public Customer(ATM atm,String name1,float amt){

        this.atm1=atm;
        this.name=name1;
        this.amount=amt;
    }

    public void run() {
        useAtm();
    }

    void useAtm() {
        atm1.checkBalance(name);
        atm1.withdrawAmount(name, amount);
    }

}



