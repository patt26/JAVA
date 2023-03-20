package Exercises.Arithmetic;

import java.util.Scanner;


public class AbstractExercise {
    public static void main(String[] args) {
//        Shape rectangle=new Rectangle(3,5);
//        rectangle.area();
//        rectangle.perimeter();
//        System.out.println("----------------------");
//        Shape circle=new Circle(34);
//        circle.perimeter();
//        circle.area();
        Rectangle rec= new Rectangle();
        Practice2 prac=new Practice2();



    }
}
abstract class Shape{
    abstract void perimeter();
    abstract void area();


}
class Circle extends Shape{
    Scanner sc=new Scanner(System.in);
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void perimeter(){
        double perimeter=2*Math.PI*radius;
        System.out.println("Perimeter of Circle= "+perimeter);
    }

    public void area(){
        double area=Math.PI*radius*radius;
        System.out.println("Area of Circle: "+area);
    }
}
class Rectangle extends Shape{
    public Rectangle() {
    }

    Scanner sc=new Scanner(System.in);
    double length;
    double breadth;
    public Rectangle(double length,double breadth){
        this.length=length;
        this.breadth=breadth;
    }

    public void perimeter(){

        double perimeter=2*(length*breadth);
        System.out.println("Perimeter of Rectangle: "+perimeter);

    }
    public void area(){
        double area=length*breadth;
        System.out.println("Area of Rectangle: "+area);
    }
    public void Meth3(){
        System.out.println("Method of Rectangle class");
    }
}
 interface Practice{
        void Meth1();
        void Meth2();
}
class Practice2 extends Rectangle implements Practice{
   public void Meth1(){
       System.out.println("Method1 of Practice2 class");
    }
    public void Meth2(){
        System.out.println("Method2 of Practice class");

    }

}