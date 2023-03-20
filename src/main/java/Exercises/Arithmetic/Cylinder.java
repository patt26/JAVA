package Exercises.Arithmetic;

public class Cylinder {
    private double Radius,Height;

    public double getHeight() {
        return Height;
    }

    public double getRadius() {
        return Radius;
    }

    public void setRadius(double radius) {
        if(Radius<0)Radius = 0;
        else Radius=radius;
    }

    public void setHeight(double height) {
       if(Height<0) Height =0;
       else Height=height;
    }
    public void setDimensions(double radius, double height){
        Radius=radius;
        Height=height;
    }

    public Cylinder(double radius, double height) {
        Radius = radius;
        Height = height;
    }

    public Cylinder() {
        Radius=1;
        Height=1;
    }

    public Cylinder(double radius) {
        Radius = radius;
        Height=1;
    }
    public double area(double r,double h){
        return Math.PI*r*r*h;
    }

    public static void main(String[] args) {
        Cylinder cyl=new Cylinder(8);
        cyl.setHeight(3);
        System.out.println(cyl.area(cyl.Height, cyl.Radius));
    }

}

