import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Source {
    public static String[] getCustomer(String city) {
        String[][] customer = new String[5][3];
        customer[0][0] = "102";
        customer[0][1] = "Krithick";
        customer[0][2] = "Bangalore";

        customer[1][0] = "105";
        customer[1][1] = "Prabu";
        customer[1][2] = "Chennai";

        customer[2][0] = "202";
        customer[2][1] = "Shravan";
        customer[2][2] = "Pune";

        customer[3][0] = "205";
        customer[3][1] = "Kiran";
        customer[3][2] = "Mumbai";

        customer[4][0] = "252";
        customer[4][1] = "Chandraw";
        customer[4][2] = "Delhi";

        String[] details = new String[3];
        details = null;

        for (int i = 0; i < 5; i++) {
            if (city.equals(customer[i][2])) {
                details = customer[i];
                break;
            }
        }
        return details;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Source a = new Source();
        if (in.hasNext()) {
            String city = in.next();
            String res[] = new String[3];
            res = a.getCustomer(city);
            for (int i = 0; i < 3; i++) {
                System.out.println(res[i] + " ");
            }
        }
    }
}