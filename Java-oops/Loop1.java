import java.util.Scanner;

public class Source {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if (a < 1 || a > 999) {
            System.out.println("INVALID_INPUT");
        } else {
            System.out.println(Integer.toBinaryString(a));
        }
    }
}
