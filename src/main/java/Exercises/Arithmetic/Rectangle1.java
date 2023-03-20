package Exercises.Arithmetic;

import java.awt.Rectangle;

public class Rectangle1 extends Quadratic  {
    private double length,breadth;

    public double area(){
        return length*breadth;

    }
    public double perimeter(){
        return 2*(length+breadth);
    }
    public boolean isSquare(){
        return length == breadth;
    }
    public double getLength(){
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
        int math=t*r;

    }

    @Override
    public String toString() {
        return "Rectangle1{" +
                "length=" + length +
                ", breadth=" + breadth +
                '}';
    }

    public static void main(String[] args) {
        Rectangle1 rec=new Rectangle1();
        rec.length=32;
        rec.breadth=31;
        System.out.println(rec.area());
        System.out.println(rec.perimeter());
        System.out.println(rec.isSquare());
        System.out.println(rec);


    }


}
