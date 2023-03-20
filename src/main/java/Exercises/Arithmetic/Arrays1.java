package Exercises.Arithmetic;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays1 {
    public static int[] Numbers = {2, 4, 7, 1, 8, 3};
    public static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        //SumOfAllElement();
        //SearchElement();
        //  InArray(3,6);
        // ShiftingOfArray();
      //  InsertingInArray(3, 11);
      //  DeleteFromArray(3);
     //   CopyingArray();
      //  ReverseArray();
     //   TwoDimensionalArrays();
        MatricesMultiplication();
    }

    public static void SumOfAllElement() {
        int sum = 0;
        for (int i = 0; i < Numbers.length; i++) {
            sum = sum + Numbers[i];
        }
        System.out.println(sum);
    }

    public static void SearchElement() {
        Integer comman = null;
        int index = 0;
        System.out.println("Enter element: ");
        int digit = sc.nextInt();
        for (int i = 0; i < Numbers.length; i++) {
            if (digit == Numbers[i]) {
                comman = digit;
                index = i;
            }
        }
        if (comman == null) {
            System.out.println("Number is not in Array, Try again");
        } else {
            System.out.println(+digit + " is present in Array at position " + (index + 1));
        }
    }

    public static void InArray(int a, int b) {
        int[] array1 = new int[2];
        System.out.print("Enter numbers = ");
        array1[0] = sc.nextInt();
        array1[1] = sc.nextInt();
        for (int x : array1
        ) {
            System.out.println(x);
        }


    }

    public static void ShiftingOfArray() {
        System.out.println("Enter the direction that you want to shift array: ");
        String choice = sc.nextLine();
        switch (choice) {
            case "Left":
                int temp = Numbers[0];
                for (int i = 1; i < Numbers.length; i++) {
                    Numbers[i - 1] = Numbers[i];
                }
                Numbers[Numbers.length - 1] = temp;
                for (int x : Numbers
                ) {
                    System.out.println(x);
                }
                break;
            case "Right":
                int temp1 = Numbers[Numbers.length - 1];
                for (int i = Numbers.length - 1; i > 0; i--) {
                    Numbers[i] = Numbers[i - 1];
                }
                Numbers[0] = temp1;
                for (int x : Numbers
                ) {
                    System.out.println(x);
                }
                break;
        }

    }

    public static void InsertingInArray(int index, int value) {
        int[] newOne = new int[10];
        int sum = 0;
        int term = 0;
        for (int i = 0; i < newOne.length - 5; i++) {
            sum = sum + 3;
            newOne[i] = sum;
        }
        for (int i = 0; i < newOne.length; i++) {
            System.out.print(newOne[i] + ",");
            System.out.print("");
        }
        System.out.println("\n");
        for (int i = newOne.length - 6; i > index; i--) {
            newOne[i] = newOne[i - 1];
            newOne[index] = value;
        }
        for (int i = 0; i < newOne.length; i++) {
            System.out.print(newOne[i] + ",");
            System.out.print("");
        }
    }

    public static void DeleteFromArray(int index) {
        int[] newOne = new int[10];
        int sum = 0;
        for (int i = 0; i < newOne.length - 5; i++) {
            sum = sum + 3;
            newOne[i] = sum;
        }
        for (int i = 0; i < newOne.length; i++) {
            System.out.print(newOne[i] + ",");
            System.out.print("");
        }
        System.out.println("\n");
        for (int i = index; i < newOne.length-1; i++) {
            newOne[i] = newOne[i + 1];
        }
        for (int i = 0; i < newOne.length; i++) {
            System.out.print(newOne[i] + ",");

        }
    }

    public static void CopyingArray(){
        int[] A1={2,5,7,3,1};
        int[] A2=new int[A1.length];

        for (int x:A1
             ) {
            System.out.print(x+",");
        }
        System.out.println("\n");
        for(int i=0;i<A1.length;i++){
            A2[i]=A1[i];
        }
       // System.out.println("Copied Array: "+java.util.Arrays.toString(A2));
        for (int x:A2
        ) {
            System.out.print(x+",");
        }
    }

    public static void ReverseArray(){
        int [] array={3,6,21,25,67,89,90};
       int [] B1=new int[array.length];
        System.out.println("User given array: "+ java.util.Arrays.toString(array));
        for(int i=array.length-1,j=0;i>=0;i--,j++){
            B1[j]=array[i];
        }
        System.out.println("Reverse Array: "+java.util.Arrays.toString(B1));
    }

    public static void TwoDimensionalArrays(){
        int A[][]=new int[2][6];
        int B[][]={{2,3,4,5},{5,6,7,8}};
        for (int i=0;i<B.length;i++){
            for(int j=0;j<B[i].length;j++){
                System.out.print(B[i][j]+",");
            }
            System.out.println("");
        }
        System.out.println("--------------");
        int C[][]={{3,5},{},{},{}};
        C[0]= new int[]{10, 13, 14};
        C[1]=new int[]{18,19,23,36};
        C[2]=new int []{45,76,98,45,987,234,45};
        C[3]=new int[3];

        for (int i=0;i<C.length;i++){
            for(int j=0;j<C[i].length;j++){
                System.out.print(C[i][j]+",");
            }
            System.out.println("");
        }
        System.out.println("--------------");
        for (int[] x :C
             ) {
            for (int y:x
                 ) {
                System.out.print(y+",");
            }
            System.out.println("");
        }
    }
    public static void MatricesMultiplication(){
        int A[][]={{3,5,9},{7,6,2},{4,3,5}};
       int B[][]={{1,5,2},{6,8,4},{3,9,7}};
       int C[][]=new int[3][3];

       // Alternate short method for same
//       for(int i=0;i<3;i++){
//           for(int j=0;j<3;j++){
//               C[i][j]=A[i][j]+B[i][j];
//           }
//       }

       for(int i=0;i<A.length;i++){
           for(int i1=0;i1<B.length;i1++){
               for (int j=0;j<A[i].length;j++){
                   for(int j1=0;j1<B[i].length;j1++){
                       C[i][j]=A[i][j]*B[i][j];
                   }
               }
           }
       }
        for (int x[]:C
             ) {
            for (int y:x
                 ) {
                System.out.print(y+",");
            }
            System.out.println("");
        }
    }
}

