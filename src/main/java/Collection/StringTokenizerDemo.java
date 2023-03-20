package Collection;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class StringTokenizerDemo {
    public static void main(String[] args) throws Exception {
        FileInputStream fis=new FileInputStream("C:\\\\Users\\\\Pratik.Kharche\\\\Documents\\\\All OutputFiles\\\\NumbersInArray.txt");
        byte []b=new byte[fis.available()];
        fis.read(b);
        String data=new String(b);

        StringTokenizer str=new StringTokenizer(data,",");
        TreeSet<Integer> arr=new TreeSet<>();
        String a;
        while(str.hasMoreElements()){
            a=str.nextToken();
            arr.add(Integer.valueOf(a));
        }
        System.out.println(arr);
    }
}
