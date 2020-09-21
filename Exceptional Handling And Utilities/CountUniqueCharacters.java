import java.util.Scanner;

public class Source {
    public static int getUniqueCharacterCount(String str) {
        str = str.replaceAll("\\s", "");
        str = str.toLowerCase();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            boolean flag = false;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j) && i != j) {
                    flag = true;
                    break;
                }
            }
            if (!flag)
                count++;
        }
        if (count > 0)
            return count;
        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        int n = getUniqueCharacterCount(word);
        if (n == -1)
            System.out.println("No unique character/s");
        else
            System.out.println(n + " unique character/s");

    }
}