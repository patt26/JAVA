package Multithreading;

public class withThreadClass extends Thread {
    public void run(){
        int i=0;
        while(i<=100){
            System.out.println(i+" hello");
            i++;
        }
    }

    public static void main(String[] args) {
        withThreadClass t=new withThreadClass();
        //withInterfaceRunnable t1=new withInterfaceRunnable();
       // Thread tt=new Thread(t1);
        t.start();
      //  tt.start();


        int i = 0;
        while(i<=100){
            System.out.println(i+" world");
            i++;
        }
    }
}
class withInterfaceRunnable implements Runnable{
    public void run(){
        int i=0;
        while(i<=100){
            System.out.println(i+" Welcome");
            i++;
        }
    }

    public static void main(String[] args) {
        withInterfaceRunnable wI=new withInterfaceRunnable();
        Thread t=new Thread(wI);
        t.start();
        int i = 0;
        while(i<=100){
            System.out.println(i+" Home");
            i++;
        }

    }
}
