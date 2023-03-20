package Exercises.Arithmetic;

public class Methods extends Clasess {
    public static void main(String[] args) {
//        int A[]={2,4,78,43,2};
//        int a=10,b=4;
//        update(a);
//        update(A);
//        System.out.println(A[0]);
        //PrimeNumberChecker(9);
      //  System.out.println(HCF(25,15));
       // Printf(2,4,5,6,7,8,9,0);
      //  showList(234,"Jhon","Anthony","Numer","Tony");
     //   System.out.println(Max(65,34,24,24,54,23,54,5324));
      //  Max(34,54,23,45,245);
       // System.out.println(Sum(67,87));
        DiscountCalculator(200,400,211,500);



    }

    public void Comman(){
    Elements();
    }
    public static void update (int x){
        x++;
        System.out.println(x);
    }
    public static void update(int[] A){
        A[0] = 35;

    }
    public static void PrimeNumberChecker(int n){
       int count=0;
       int result=0;
        for(int i=1;i<=n/2;i++){
            result=n%i;
            if(result==0){
                count++;
            }
        }
        if(count<2){
            System.out.println("Number is prime Number");
        }else{
            System.out.println("Number is not prime number");
        }
    }
    static int HCF(int a,int b){
        while(a!=b) {
            if (a < b) b = b - a;
            else a = a - b;
        }
        return b;

    }

    static void Printf(int... x) {
        for (int a : x
        ) {
            System.out.println(a);
        }
    }

    public static void showList(int a,String ...A){
        for (int i=1;i< A.length;i++){
            System.out.println(a+". "+A[i]);
            a++;
        }
    }

    public static int Max(int ...A){
        if(A.length==0) return Integer.MIN_VALUE;
        int m=A[0];
        for(int i=0;i<A.length;i++){
           if(A[i]>m){
               m=A[i];
           }

        }
        return m;
    }
    public static double Sum(double...A){
        if(A.length==0) return 0;
        double digit=A[0];
        double sum=0;
        for(int i=0;i<A.length;i++){
            sum=sum+A[i];
        }
        return sum;
    }

    public static void DiscountCalculator(double...A){

        double price=0;
       double sum= Sum(A);
        System.out.println("Total price of products: "+sum);
        if(sum<500){
            price=sum-sum*(10d/100d);
        }if(sum>500&&sum<1000){
            price=sum-sum*(15d/100d);
        }if(sum>1000)price=sum-sum*(20d/100d);
        System.out.println("Price after Discount: "+price);
    }

}

