package Collection;

import java.util.*;
import java.util.Map.*;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer,String> tm=new TreeMap<>(Map.of(1,"A",2,"B",3,"C",4,"D"));
        System.out.println(tm);
//        TreeMap<Integer,String> tm1=new TreeMap<>(Map.of(1,"B",2,"M",5,"N"));
//        tm1.forEach((Integer,String)->tm.merge(Integer,String, java.lang.String::concat));

    }
}
