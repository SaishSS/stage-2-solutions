import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Source {
    public static String[] getToys(String[] arr) {
        Arrays.sort(arr);
        return arr;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String Toys[] = new String[5];
        for (int i = 0; i < 5; i++) {
            Toys[i] = in.next();
        }
        String[] result = getToys(Toys);
        for (int i = 0; i < 5; i++) {
            System.out.println(result[i]);
        }
    }
}