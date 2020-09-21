import java.util.*;
import java.util.Collections;
import java.util.List;

class Source {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> l1 = new ArrayList<Integer>();
        List<Integer> l2 = new ArrayList<Integer>();
        int a;
        for (int i = 0; i < 5; i++) {
            a = in.nextInt();
            l1.add(i, a);
        }
        for (int i = 0; i < 5; i++) {
            a = in.nextInt();
            l2.add(i, a);
        }
        List<Integer> l3 = mergeAndSort(l1, l2);
        System.out.println(l3);
    }

    public static List<Integer> mergeAndSort(List<Integer> al1, List<Integer> al2) {
        List<Integer> temp = new ArrayList<Integer>();
        List<Integer> res = new ArrayList<Integer>();
        if (al1.size() != 5 || al2.size() != 5) {
            throw new IllegalArgumentException();
        } else {
            for (int i = 0, j = 0; i < 5 || j < 5; i++) {
                if (i < 5)
                    temp.add(i, al1.get(i));
                else {
                    temp.add(j, al2.get(j));
                    j++;
                }
            }
            Collections.sort(temp);
            int ind = 0;
            for (int i = 0; i < temp.size(); i++) {
                if (i == 2 || i == 6 || i == 8) {
                    res.add(ind, temp.get(i));
                    ind++;
                }
            }
            return res;
        }
    }
}
