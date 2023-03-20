package Collection;

import java.util.*;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        Integer[] numbers=new Integer[]{23,23,54,214,54};

        List<Integer> l=new ArrayList<>(List.of(3,6,7,8,9,7));
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>(new MyComp());
        pq.add(23);
        pq.add(23);
        pq.add(34);
        pq.forEach(System.out::println);

    }
}
class MyComp implements Comparator<Integer>{
    public int compare(Integer o1,Integer o2){
        return o2.compareTo(o1);
    }
}
