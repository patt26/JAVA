package Multithreading.InterProcessCommunication;

public class Producer extends Thread {
    public Producer(Data d1) {
        this.data = d1;
    }

    Data data;

    public void run() {
        int count = 1;
        while (true) {
            data.set(count);
            count++;
        }
    }
}

class Consumer extends Thread {
    public Consumer(Data d1) {
        this.data = d1;
    }

    Data data;

    @Override
    public void run() {
        while (true) {
            data.get();
        }

    }
}

