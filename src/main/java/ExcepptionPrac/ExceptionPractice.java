package ExcepptionPrac;

import java.io.FileOutputStream;

public class ExceptionPractice {
    public static void main(String[] args) throws Exception {
     try{
         anotherOne(10,4);
     }catch (NoZeroDivideException n){
         System.out.println(n);
     }

        try {
            try {
                int[] A = {2, 4, 1, 5, 7, 0};
                int res = A[3] / A[9];
                int res1 = A[3] / A[5];
                System.out.println(A[9]);
                int a = 20;
                int b = 4;
                int z = a / b;
                System.out.println(z);
            } catch (Exception e) {

                System.out.println("Check index");
            }
        } catch (Exception e) {
            System.out.println("Divided by 0");

        } finally {
            System.out.println("done");
        }

    }
    static int newOne(int a,int b) throws NoZeroDivideException{
        if(a<0||b<0){
            throw new NoZeroDivideException();
        }
        return a*b;
    }
    static void anotherOne(int a,int b) throws NoZeroDivideException{
        System.out.println(newOne(a,b));
    }


}
