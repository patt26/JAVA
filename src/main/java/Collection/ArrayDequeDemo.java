package Collection;

import java.util.ArrayDeque;
import java.util.List;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq=new ArrayDeque<>(List.of(3,6,9,12,15));
        dq.offerFirst(1);
        dq.offerLast(20);
        dq.forEach(System.out::println);
    }
}
