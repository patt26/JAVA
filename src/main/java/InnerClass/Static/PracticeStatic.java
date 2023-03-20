package InnerClass.Static;


public class PracticeStatic{
    static int a=13;
    int b=23;
   protected void show(){
        System.out.println(a);
    }
     protected static void display(){
        System.out.println(a);
    }
    void clock(){
        System.out.println(a);
    }
    class Prac{
        void watch(){
            System.out.println(b+a);
            show();


        }
    }
}
class Main extends PracticeStatic{
   public void just(){
       display();
   }
   protected static void display(){

   }


    public static void main(String[] args) {
        System.out.println( PracticeStatic.a);
       PracticeStatic practiceStatic=new PracticeStatic();
       practiceStatic.show();
    }
}


final class finalprac{
    int a=2;
    final int MIN;
    {
        MIN=32;
    }
    void show(){
        System.out.println(a);
    }
}
class prac {
    finalprac fp=new finalprac();
    void use(){
        int v=fp.a;
    }

}
