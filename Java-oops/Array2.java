import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Source {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if (a < 1 || a > 20) {
            System.out.println("INVALID_INPUT");
        } else {
            Integer ar[] = new Integer[a];
            for (int i = 0; i < a; i++) {
                ar[i] = in.nextInt();
            }
            int size = ar.length;
            if (size != a) {
                return;
            }

            if (a % 2 == 0) {
                Arrays.sort(ar);
            } else {
                Arrays.sort(ar, Collections.reverseOrder());
            }
            for (int i = 0; i < a; i++) {
                System.out.print(ar[i] + " ");
            }
        }
    }
}
