package Multithreading.InterProcessCommunication;

public class Data {
    int value;
    boolean flag = true;

    synchronized public void set(int v) {
        while (!flag) {
            try {
                wait();
            } catch (Exception e) {
            }
        }
        System.out.println("Producer " + v);
        value = v;
        flag = false;
        notify();
    }

    synchronized public void get() {
        int x = 0;
        while (flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        x = value;
        flag = true;
        System.out.println("Consumer " + x);
        notify();
    }
}



