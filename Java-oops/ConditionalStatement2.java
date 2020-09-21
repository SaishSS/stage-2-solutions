import java.util.Scanner;
import java.io.*;

class Source {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int a, b, c;
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        if (!(a > b && a > c && b > c)) {
            System.out.println("INVALID_INPUT");
        } else {
            if (a > b && a > c) {
                if ((a * a) == (b * b) + (c * c))
                    System.out.println("RIGHT ANGLE");
                else
                    System.out.println("NOT RIGHT ANGLE");
            }
            if (b > c && b > a) {
                if ((b * b) == (c * c) + (a * a))
                    System.out.println("RIGHT ANGLE");
                else
                    System.out.println("NOT RIGHT ANGLE");
            }
            if (c > a && c > b) {
                if ((c * c) == (a * a) + (b * b))
                    System.out.println("RIGHT ANGLE");
                else
                    System.out.println("NOT RIGHT ANGLE");
            }
        }
    }
}