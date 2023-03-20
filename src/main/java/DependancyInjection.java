public class DependancyInjection {
    private final Point point;
    private final Reverse reverse;

    public DependancyInjection(Point point, Reverse reverse) {
        this.point = point;
        this.reverse = reverse;
    }

    public void methods() {
        System.out.println("hello");
    }


    public static void main(String[] args) {
        Point point = new Point();
        Reverse reverse = new Reverse();

        DependancyInjection dependancyInjection = new DependancyInjection(point, reverse);
        System.out.println(dependancyInjection);
        String str="kl";

    }
}
