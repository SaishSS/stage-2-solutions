import java.util.Scanner;

public class Source {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if (num <100 || num>999) {
            System.out.println("INVALID_INPUT");
        } else {
            int sum=0,a,temp;
            temp=num;
            while(num>0) {
                a=num%10;
                num/=10;
                sum+=(a*a*a);
            }
            if(temp==sum)
                System.out.println("ARMSTRONG");
            else
                System.out.println("NOT ARMSTRONG");
        }
    }
}