package Exercises.Arithmetic;

import Exercises.CarpetCostCalculator.Carpet;

import java.awt.Rectangle;
import java.util.Scanner;

public class Quadratic {
    int t=3;
   int r=4;



    public static void main(String[] args) {
        float a,b,c;


        System.out.println("Enter 3 digits: ");
        Scanner sc=new Scanner(System.in);
        a=sc.nextFloat();
        b=sc.nextFloat();
        c=sc.nextFloat();
        double equation=((-b)+Math.sqrt(b*b-4*a*c))/(2*a);
        double equation2=((-b)-Math.sqrt(b*b-4*a*c))/(2*a);
        System.out.println("Roots for given equation is " +equation +" & "+ equation2);

    }
    protected void printd(){
        System.out.println("hello");
        System.out.println();
    }
}
