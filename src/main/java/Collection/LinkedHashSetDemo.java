package Collection;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        List<Integer> ls=new ArrayList<>(List.of(3,5,4,2,4,5));
        LinkedHashSet<Integer> lhs=new LinkedHashSet<>(ls);

        System.out.println(lhs);
    }
}
