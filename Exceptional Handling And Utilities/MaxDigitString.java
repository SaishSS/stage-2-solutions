import java.util.Scanner;
import java.util.regex.*;

public class Source {
    public static int getMaxDigit(String str) {
        if (str != null) {
            Pattern p = Pattern.compile("\\d+");
            Matcher m = p.matcher(str);
            int max = 0;
            String digits = "";
            while (m.find())
                digits += m.group();
            if (digits.length() > 1) {
                String arr[] = digits.split("");
                for (int i = 0; i < arr.length; i++)
                    if (max < Integer.parseInt(arr[i]))
                        max = Integer.parseInt(arr[i]);
                if (max > 0)
                    return max;
                if (digits.isEmpty())
                    return 0;
                return 0;
            }
            return -1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int n = getMaxDigit(str);
        if (n == 0 || n == -1)
            System.out.println("No digits in string");
        else
            System.out.println(n);
    }
}