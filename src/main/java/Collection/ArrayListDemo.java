package Collection;


import java.util.*;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> a1=new ArrayList<>(List.of(3,3,5,3,25,5));
        ArrayList<Integer> a2=new ArrayList<>();
        a2.addAll(a1);
        Collections.sort(a2);


        // Using Comparator
//        Collections.sort(a1, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2-o1;
//            }
//        });


        a1.sort((a, b) -> b - a);   // By using Lambda Function
        System.out.println(a2);
        System.out.println(a1);
        for (Integer x:a1
             ) {
            System.out.print(x+" ");
        }
    }
}
