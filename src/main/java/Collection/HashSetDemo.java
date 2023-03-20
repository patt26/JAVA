package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Spliterator;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>(20,2);
        List<Integer> ls=new ArrayList<>(List.of(2,4,6));
        hs.add(23);
        hs.add(24);
        hs.add(3);
        hs.addAll(ls);
        Spliterator<Integer> sp=hs.spliterator();
        sp.forEachRemaining(System.out::println);

    }

}
