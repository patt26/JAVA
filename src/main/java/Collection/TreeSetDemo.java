package Collection;

import java.util.List;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
//        TreeSet<Integer> ts=new TreeSet<>(List.of(3,5,434,2,3));
//        TreeSet<String> tt=new TreeSet<>(List.of("hello","By","Java","JAVA"));
//        System.out.println(tt.floor("Gone"));
//        System.out.println(ts.ceiling(7647487));
        TreeSet<Point> tp=new TreeSet<>();
        tp.add(new Point(3,5));
        tp.add(new Point(1,5));
        tp.add(new Point(2,6));
        tp.add(new Point(1,7));
        tp.add(new Point(7,5));
        System.out.println(tp);

    }

}
class Point implements Comparable{
    int x;
    int y;
    public Point(int x,int y){
        this.x=x;
        this.y=y;
    }

    public String toString(){
        return "X="+x+" Y="+y;
    }

    public int compareTo(Object o){
        Point p=(Point)o;
        if(this.x>p.x) return 1;
        if(this.x<p.x) return -1;
        else{
            if(this.y>p.y) return 1;
            if(this.y<p.y) return -1;
            else{
                return 0;
            }
        }
    }
}
