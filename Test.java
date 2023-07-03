
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        /**
         * by bobrossiotta
         */
    // integer
        int a,b;
        Scanner bob = new Scanner(System.in);

        System.out.print("edge1:");
        a = bob.nextInt();
        System.out.print("edge 2");
        b=bob.nextInt();
        double c=Math.sqrt((a*a)+(b*b));
        System.out.println(c);

    } }