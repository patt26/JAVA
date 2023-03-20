package Multithreading.ClassroomProblem;

public class Whiteboard {
    String text;
    int noOfStudent=0;
    int count = 0;

    public void attendance() {
        noOfStudent++;
    }

    synchronized public void write(String msg) {
        while (count != 0)
            try {
                wait();
            } catch (Exception e) {
            }
        if (count ==0) {
            text = msg;
            count = noOfStudent;
            System.out.println("Teacher is writing " + text);
            notifyAll();
           /* try {
                Thread.sleep(1000*5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
        }
    }

    synchronized public String read() {
        while (count == 0)
            try {
                wait();
            } catch (Exception e) {
            }
        String t = text;
        count--;
        if (count == 0) {
            notify();
        }
        return t;
    }
}
