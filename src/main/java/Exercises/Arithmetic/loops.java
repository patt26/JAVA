package Exercises.Arithmetic;


import java.util.Scanner;

import static Exercises.Arithmetic.loops.Loops.sc;

public class loops {
    public static void main(String[] args) {
        // ForLoop();
//        StringReverse("man");
//        StringReverse();
//        MultiplictionOf(5);
//        SumofNumUpto(5);
//        Factorial(5);
    //  DisplayDigit(104);
        //CountNumber(2345);
        //ArmstrongNumber(9474);
       // ReverseNumber(567);
       // Palindrome(100294);
       // DisplayDigitInWord(8937592);
       //   ArithmeticSeries(2,5,10);
      //  GeometricProgression(2,2,10);
       // FibonacciSeries(10);
       // NestedForLoop();
        //NestedLoopsFor1to5InColumns();
        ForLoopPattern2();
    }

    public class Loops {
        static Scanner sc = new Scanner(System.in);

        public static void ForLoop() {

            System.out.println("Enter numb: ");
            var numb = sc.nextInt();
            for (int i = 1; i <= numb; i++) {
                if (numb % i == 0) {
                    int result = numb / i;
                    System.out.println(result);
                }
            }
        }
    }

    public static void StringReverse(String word) {
        String reverse = "";
        char c;
        for (int i = 0; i < word.length(); i++) {
            c = word.charAt(i);
            reverse = c + reverse;
        }
        System.out.println(reverse);


    }

    public static void StringReverse() {
        String reverse = "";
        char c;
        System.out.println("Enter word:: ");
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            reverse = c + reverse;
        }
        System.out.println(reverse);
    }

    public static void MultiplictionOf(int number){

        for(int i=1;i<11;i++){
            int result= number *i;
            System.out.println(result);
        }
    }
    public static void SumofNumUpto(int n){
        int result = 0;
        for(int i=1;i<=n;i++){
            result=i+result;
        }
        System.out.println("Sum of "+n+" upto is "+result);
    }

    public static void Factorial(int n){
        int result=1;
        for(int i=1;i<=n;i++){
             result=i*result;
        }
        System.out.println("Factorial of "+n+" is "+result);
    }
    public static void DisplayDigit(int num){
       while (num>0){
           int rem=num%10;
            num=num/10;
           System.out.print(rem);

        }
    }
    public static void CountNumber(int num){
       int count=0;
       int number=num;
        while(num>0){
            num=num/10;
            count++;
        }
        System.out.println("Total Number count for "+number+" is = "+count);
    }
    public static int CountNumber1(int num){
        int count=0;
        int number=num;
        while(num>0){
            num=num/10;
            count++;
        }
        return count;
    }
    public static void ArmstrongNumber(int number){
        int sum=0;
        int Number =number;
        while(number>0){
            int rem=number%10;
            sum= (int) (sum+Math.pow(rem,CountNumber1(Number)));
            number=number/10;

        }
        if(Number==sum){
            System.out.println("Number is Armstrong Number");
        }else
        System.out.println("Number is not Armstrong Number");
    }
    public static void ReverseNumber(int number){
        int rev=0;
        while(number>0){
            int numb=number%10;
            rev=rev*10+numb;
            number=number/10;
        }
        System.out.println(rev);
    }
    public static int ReverseNumber1(int number) {
        int rev = 0;
        while (number > 0) {
            int numb = number % 10;
            rev = rev * 10 + numb;
            number = number / 10;
        }
        return rev;
    }

    public static void Palindrome(int numb){
        if(ReverseNumber1(numb)==numb){
            System.out.println(numb+" is Palindrome number");
        }else
            System.out.println(numb+" is not Palindrome");
    }

    public static void DisplayDigitInWord(int digit){
        char rev;
        String reverse="";
        String str=new String(String.valueOf(digit));
            for(int i=0;i<str.length();i++){
                 rev=str.charAt(i);

                switch(rev){
                    case '0':
                        System.out.print("Zero ");
                        break;
                    case '1':
                        System.out.print("One ");
                        break;
                    case '2':
                        System.out.print("Two ");
                        break;
                    case '3':
                        System.out.print("Three ");
                        break;
                    case '4':
                        System.out.print("Four ");
                        break;
                    case '5':
                        System.out.print("Five ");
                        break;
                    case '6':
                        System.out.print("Six ");
                        break;
                    case '7':
                        System.out.print("Seven ");
                        break;
                    case '8':
                        System.out.print("Eight ");
                        break;
                    case '9':
                        System.out.print("Nine ");
                        break;
                    default:
                        System.out.print("Invalid");
                        break;
                }


            }

    }
    public static void ArithmeticSeries(int start,int diff,int totalTimes){
        for(int i=0;i<=totalTimes;i++){
            System.out.print(start+" ");
            start=start+diff;
        }
    }
    public static void GeometricProgression(int start,int ratio,int totalTimes){
        for(int i=0;i<totalTimes;i++){
            System.out.print(start+" ");
            start=start*ratio;
        }
    }
    public static void FibonacciSeries(int number){
        int a=0;
        int b=1;
        System.out.println(a+"\n"+b);
        for(int i=0;i<number-2;i++){
            int c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
    public static void NestedForLoop(){
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print("(" +i+","+j+ ") ");
            }
            System.out.println(" ");
        }
    }
    public static void NestedLoopsFor1to5InColumns(){
       int count=0;
        for(int i=0;i<6;i++){
            for(int j=0;j<6;j++){
                System.out.print(++count+"  ");
            }
            System.out.println("");
        }
    }
    public static void ForLoopPattern(){
        for(int i=1;i<6;i++){
            for(int j=1;j<i;j++){
                System.out.print(j+" ");
            }
            System.out.println("");
        }
    }
    public static void ForLoopPattern2(){
       int count=0;
        for(int i=1;i<6;i++){
            for(int j=1;j<i;j++){
                System.out.print(count+++" ");
            }
            System.out.println("");
        }
    }

}

