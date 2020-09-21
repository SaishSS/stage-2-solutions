import java.util.*;

class Sequence {
    public static int sequences(String str) {
        String s[] = str.split(",");
        int arr[] = new int[s.length], sum = 0;
        try {
            for (int i = 0; i < s.length; i++) {
                arr[i] = Integer.parseInt(s[i]);
            }
            int n[] = new int[arr.length];
            int j = 1;
            int m = arr.length;
            while (j < m) {
                for (int i = 0; i < n.length - 1; i++) {
                    arr[i] = arr[i + 1] - arr[i];
                    n[i] = arr[i];
                }
                n = new int[n.length - 1];
                j++;
            }
        } catch (NumberFormatException e) {
            throw e;
        }
        return arr[0];
    }
}

class Source {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str;
        try {
            str = in.next();
            int result = Sequence.sequences(str);
            System.out.println(result);
        } catch (ArrayIndexOutOfBoundsException e) {
        } catch (NumberFormatException e) {
        }
    }
}