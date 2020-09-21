import java.util.*;

class Source {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        a = in.nextInt();
        if (a < 1 || a > 20) {
            System.out.println("INVALID_INPUT");
        } else {
            int ar[] = new int[a];
            for (int i = 0; i < a; i++) {
                ar[i] = in.nextInt();
            }
            int size = ar.length;
            if (size != a) {
                return;
            }
            int min = ar[0], max = 0;
            for (int i = 0; i < a; i++) {
                if (ar[i] < min) {
                    min = ar[i];
                } else if (ar[i] > max) {
                    max = ar[i];
                }
            }

            System.out.println("MIN=" + min);
            System.out.println("MAX=" + max);
        }
    }
}
