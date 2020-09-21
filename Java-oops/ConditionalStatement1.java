import java.util.Scanner;

public class Source {
    public static void main(String[] args) {
        Integer a, sum = 0;
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            a = in.nextInt();
            if (a < 0 || a > 100) {
                System.out.println("INVALIDMARKS");
                return;
            } else {
                sum += a;
            }
        }
        sum /= 3;
        if (sum >= 70) {
            System.out.println("DISTINCTION");
        } else if (sum >= 60) {
            System.out.println("FIRST");
        } else if (sum >= 50) {
            System.out.println("SECOND");
        } else if (sum >= 40) {
            System.out.println("THIRD");
        } else if (sum < 40) {
            System.out.println("FAIL");
        }
        return;
    }
}