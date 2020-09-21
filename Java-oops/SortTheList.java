import java.util.*;
import java.io.*;
import java.util.Scanner;

class Source {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String sentence = in.nextLine();
        List<String> actual = Source.sort(sentence);
        System.out.println(actual);
    }

    static List<String> sort(String sent) {
        List<String> l1 = new ArrayList<String>();
        if (sent == null || sent.equals(""))
            return l1;
        String temp[] = sent.split(" ");
        for (int i = 0; i < temp.length; i++) {
            l1.add(i, temp[i]);
        }
        Collections.sort(l1, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length()) {
                    return 1;
                } else {
                    return o1.compareTo(o2);
                }
            }
        });
        return l1;
    }
}
