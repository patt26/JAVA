package Collection;

import java.util.Hashtable;

public class HashTableObsoluteDemo {
    public static void main(String[] args) {
        Hashtable hs = new Hashtable();
        hs.put(1, "A");
        hs.put("A", 2);

        System.out.println(hs);
    }
}
