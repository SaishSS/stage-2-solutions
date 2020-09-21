import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Source {
    public String customerArray[][] = new String[5][3];

    public void createCustomer(String[][] array) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                customerArray[i][j] = array[i][j];
            }
        }
    }

    public static void sort2DArray(String[][] array, int col_index) {
        for (int i = 0; i < array.length; i++) {
            int index = i;
            for (int j = i - 1; j >= 0; j--, index--) {
                if (Integer.parseInt(array[j][col_index]) > Integer.parseInt(array[index][col_index])) {
                    swap2rows(array, index, j);
                } else
                    break;
            }
        }
    }

    public static void swap2rows(String[][] array, int index, int j) {
        String temp;
        for (int i = 0; i < array[j].length; i++) {
            temp = array[j][i];
            array[j][i] = array[index][i];
            array[index][i] = temp;
        }
    }

    public String[][] getCustomers() {
        sort2DArray(customerArray, 0);
        return customerArray;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Source a = new Source();
        String[][] customerDetails = new String[5][3];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                customerDetails[i][j] = in.next();
            }
        }
        a.createCustomer(customerDetails);
        String[][] res = a.getCustomers();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}