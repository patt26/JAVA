package Exercises.Arithmetic;

import java.util.Scanner;

public class General {
    General(){
        System.out.println("Non Param");
    }
    General(int x){
        System.out.println("Param ");
    }
    public void Display(){
        System.out.println("Test");
    }

     public static void main(String[] args) {
         Ordinary o=new Ordinary(7);
     }
}
  class Ordinary extends General{
     Ordinary(){

         System.out.println("Non Param Child");
     }
     Ordinary(int x){

         System.out.println("Param Child");
     }
    public void Watch(){
        System.out.println("watcher");
        General gen=new Ordinary();

    }


}
class Triangle extends General{
    int breadth,height;
    Triangle(int breadth,int height ){
        this.breadth=breadth;
        this.height=height;
    }
    void display(){
        System.out.println(breadth);
        System.out.println(height);
    }

    public static void main(String[] args) {
        Triangle tr=new Triangle(3,6);
        tr.display();
        Triangle tr2=new Triangle(9,12);
        tr2.display();
    }
}
class hello{
   public static Scanner sc=new Scanner(System.in);
    private String name;
    private int index;

    public String getName() {
        return name;
    }

    public int getIndex() {
        return index;
    }


    public hello(String name, int index) {
        this.name = name;
        this.index = index;
    }


    public static void main(String[] args) {
        System.out.println("Enter Name: ");
        String name=sc.nextLine();
        System.out.println("Enter Index: ");
        int index=sc.nextInt();
        hello he=new hello(name,index);
        System.out.println(he.getName()+","+he.getIndex());
    }
}
class Parent{
    public void Pam(){
        System.out.println( "Parent method");
    }
    public void M2(){
        System.out.println("Parent method 2");
    }

}
class Child extends Parent{
    public void Pam(){

        System.out.println("Child Method");
    }
    public void M3(){
        System.out.println("Child method 2");
    }

    public static void main(String[] args) {
//        Child ch=new Child();
//        ch.Pam();
//        ch.M2();

       Two two=new Two(3);
       Super sup=null;
    }
}
 class One{
    public One(){

        System.out.println("Non parematrized constructor 1");
    }
    public One(int x){

        System.out.println("Paramatarized constructor 2");
    }
    public void one(){
        System.out.println("Method call");
    }
}
class Two extends One{
    public Two(){
        System.out.println("Constructor of two non param");
    }
    public Two(int x){
        super(x);      //for calling paramatarized constructor use super() in child class
        System.out.println("Constructor of two param");
    }
    public void two(){
        System.out.println("Method of Two");
    }
}

abstract class Super{
    public Super(){
        System.out.println("Constructor for super");
    }
    public void super1(){
        System.out.println("Method of super");
    }
     abstract public void super2();
}
abstract class sub extends Super{
   public void super1(){
       System.out.println("Meth1 sub");
   }
   abstract public void super3();

}


