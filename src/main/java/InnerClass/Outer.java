package InnerClass;

public class Outer {
    int x=10;
     class  inner{
        int y=20;
        void print(){
//            System.out.println(x);
            System.out.println(y);
        }
    }
    class InnerOuter{
         void printOuter(){
             Outer outer=new Outer();
             System.out.println(outer.x);
        }
    }
}
 class Main{
     public static void main(String[] args) {
         Outer.inner inner= new Outer().new inner();
         inner.print();
         Outer.InnerOuter innerOuter=new Outer().new InnerOuter();
         innerOuter.printOuter();


     }
}
