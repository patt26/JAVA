package Collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        int maxCapacity=4;
        LinkedHashMap<Integer,String > lhm=new LinkedHashMap<>(maxCapacity ,0.4f,true){
            protected boolean removeEldestEntry(Map.Entry e){
                return size()>maxCapacity;
            }
        };
        lhm.putIfAbsent(1,"a");
        lhm.put(2,"b");
        lhm.putIfAbsent(3,"c");
        lhm.putIfAbsent(6,"c");
        lhm.putIfAbsent(4,"r");
        String str=lhm.get(7);
        System.out.println(lhm);
    }
}
