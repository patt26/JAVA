package Generics;

public class GenericMethods {
    public static void main(String[] args) {
        show(new String[]{"Hello","Nice","Cool"});
        show(new Integer[]{11,34,234});

    }
    public static <T> void show(T[] list){
        for(T x:list){
            System.out.print(x);
        }
    }
}
