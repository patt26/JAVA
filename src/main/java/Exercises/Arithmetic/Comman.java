package Exercises.Arithmetic;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Comman {
    public static void main1(String[] args) {
//       char[]b={'a','b','c','d'};
//       String str=new String(b);
//        System.out.println(str);
//        int l=str.length();
//        System.out.println(l);
//        String str2="     Hello     ";
//        String mod=str2.trim();
//        System.out.println(mod);
//        System.out.println("Enter Name: ");
//        Scanner sc=new Scanner(System.in);
//        String s=sc.nextLine().trim();
//       String mod2=s.substring(1,3);
//        System.out.println("Modified String: "+mod2);
//        String mod3=s.replace('r','a');
//        System.out.println(mod3);

//        String str="Oracle";
//        String str1="Java";
//        System.out.println(str1.compareTo(str));
        String email="programmer@gmail.com";
        int i=email.indexOf("@");
        String domain=email.substring(i+1,email.length());
       String name=email.substring(0,i);
        System.out.println(domain);
        System.out.println(name);
        System.out.println(domain.equals("gmail.com"));

      //  System.out.println(z);
    }

    public static void main(String[] args) {
        int b=10110001;
        String str=new String(String.valueOf(b));
      //  System.out.println(str.matches("[01]*"));
        String str2="a!B@c#1$2%3";
        System.out.println(str2.replaceAll("[!@#$%]",""));
        String spaces="AB     cfio       fawd     YUki";
        String modified=(spaces.replaceAll("\\s+"," "));
        String words[]=spaces.split("\\s+");
        System.out.println(words.length);


    }
}