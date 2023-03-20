package Multithreading;

public class ThreadMethods extends Thread{
    public ThreadMethods(String name){
        super(name);
        setPriority(MAX_PRIORITY);
    }
    public static void main(String[] args) {
        ThreadMethods tm=new ThreadMethods("New Thread");
        System.out.println("ID- "+tm.getId());
        System.out.println("Priority- "+tm.getPriority());
        System.out.println("State- "+tm.getState());
        System.out.println("Name- "+tm.getName());
        tm.setName("HelloThread");
        System.out.println("Name- "+tm.getName());


    }
}
class interfaceImplementation implements Runnable{



    public void run(){

    }

    public static void main(String[] args) {
        interfaceImplementation im=new interfaceImplementation();
        Thread th=new Thread(im);
        th.setName("NewThread");
        System.out.println(th.getName());

    }
}
