package Collection;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer>ldl=new LinkedList<>(List.of(43,543,23,21,236));
        ldl.add(23);
       // LinkedList<Integer>ldl2=(LinkedList<Integer>) ldl.subList(2, ldl.size());
        System.out.println(ldl);
      //  System.out.println(ldl2);


    }
}
