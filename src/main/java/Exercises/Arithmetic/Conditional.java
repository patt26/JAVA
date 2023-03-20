package Exercises.Arithmetic;

public class Conditional {
    public static void main(String[] args) {
        int a=15;
        int b=6;
        int c=10;

        if(a>b&&a>c){
            System.out.println(a);

        }else{
            if(b>c){
                System.out.println(b);
            }else{
                System.out.println(c);
            }
        }
    }
}
