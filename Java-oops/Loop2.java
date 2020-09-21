import java.util.Scanner;

public class Source {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int min = in.nextInt();
        int max = in.nextInt();
        if (min < 3 || max > 1000 || (max < min)) {
            System.out.println("INVALID_INPUT");
        } else {
            int count, sum = 0;
            for (int i = min; i <= max; i++) {
                count = 0;
                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        count++;
                        break;
                    }
                }
                if (count == 0 && i != 1) {
                    sum += i;
                }
            }
            System.out.println(sum);
        }
    }
}
