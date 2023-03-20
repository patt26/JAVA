import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter text to reverse: ");
        String text=sc.nextLine();
        String reverse="";
        char empty;
        for(int i=0;i<text.length();i++){
            empty=text.charAt(i);
            reverse=empty+reverse;
        }
        System.out.println(reverse);
    }
}
