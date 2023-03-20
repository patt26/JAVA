package Multithreading.InterProcessCommunication;

public class InterProcess {
    public static void main(String[] args) {
        Data data = new Data();
        Consumer c = new Consumer(data);
        Producer p = new Producer(data);
        c.start();
        p.start();
    }
}
