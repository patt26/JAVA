package Exercises.Arithmetic;

import java.util.Scanner;

public class Cuboid {
    public static void main(String[] args) {
        float length,width,height;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Length: ");
        length=sc.nextFloat();
        System.out.println("Enter Width: ");
        width=sc.nextFloat();
        System.out.println("Enter Height: ");
        height=sc.nextFloat();
        float topBottom=length*width;
        float rightLeft=width*height;
        float frontBack=length*height;
        float totalArea=2*(topBottom+rightLeft+frontBack);
        float volume=length*width*height;
        System.out.println("Total Area of Cuboid is "+totalArea);
        System.out.println("Total Volume of Cuboid "+volume);

    }
}
