package Multithreading.Synchronization;

public class WithoutSync {
    public static void main(String[] args) {
        MainData d=new MainData();
        Thread1 t1=new Thread1(d);
        Thread2 t2=new Thread2(d);
        t1.start();
        t2.start();
    }
}
class MainData {
    public void display(String phrase){
        for(int i=0;i<phrase.length();i++){
            System.out.println(phrase.charAt(i));
        }
    }
}
class Thread1 extends Thread{
   public Thread1(MainData data){
      m=data;
   }
    MainData m;
    public void run(){
        m.display("Hello World");
    }
}
class Thread2 extends Thread{
    public Thread2(MainData mD){
       d=mD;
    }
    MainData d;
    public void run(){
        d.display("Welcome");
    }
}
