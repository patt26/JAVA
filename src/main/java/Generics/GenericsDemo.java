package Generics;

public class GenericsDemo {
    public static void main(String[] args) {
        Object [] arr=new Object[3];
        arr[0]="hello";
        arr[1]="no";
        arr[2]= 827597258947484895L;
       Object str;
       for(int i=0;i<3;i++){
           str= arr[i];
           System.out.println(str);
       }
    }
}
