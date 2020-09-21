import java.util.*;
import java.text.*;

public class Source {
    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        String day = getDayOfDate(str);
        System.out.println(day);
    }

    public static String getDayOfDate(String date) throws ParseException {
        Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(date);
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE");
        String stringDate = sdf.format(date1);
        return stringDate;
    }
}