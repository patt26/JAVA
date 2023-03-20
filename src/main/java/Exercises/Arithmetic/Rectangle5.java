package Exercises.Arithmetic;

import java.util.Scanner;

public class Rectangle5 extends Rectangle1{
    public static void main(String[] args) {

        float base,height,area;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Base: ");
        base=sc.nextFloat();
        System.out.println("Enter Height: ");
        height=sc.nextFloat();
        area=(base*height)/2;
        System.out.println("Area for base: " + base + " & " +" height: "+ height +" is "+area);
        Rectangle1 rece=new Rectangle1();
        rece.setLength(20);
        System.out.println("Enter breadth: ");


    }
}

