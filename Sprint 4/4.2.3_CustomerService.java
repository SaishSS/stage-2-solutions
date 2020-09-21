import java.util.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

interface CustomerService {
    void rent(int toyId);

    void display();
}

class Toy {
    String toyName, toyType;
    int minAge, toyId, maxAge, rentalAmt, refundableDeposit, quantity;
    double price;

    public Toy(int toyId, String toyName, String toyType, int minAge, int maxAge, double price, int refundableDeposit,
            int quantity, int rentalAmt) {
        this.toyId = toyId;
        this.toyName = toyName;
        this.toyType = toyType;
        this.minAge = minAge;
        this.maxAge = maxAge;
        this.price = price;
        this.rentalAmt = rentalAmt;
        this.refundableDeposit = refundableDeposit;
        this.quantity = quantity;
    }

    public int getToyId() {
        return toyId;
    }

    public String getToyName() {
        return toyName;
    }

    public String getToyType() {
        return toyType;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getRentalAmount() {
        return rentalAmt;
    }
}

class CustomerServiceImpl implements CustomerService {
    public static Toy available[] = new Toy[4];
    public Toy customerToysRentalInfo[] = new Toy[2];

    CustomerServiceImpl() {
        available[0] = new Toy(120, "Rubber Ducky", "Toy", 1, 3, 200, 20, 200, 20);
        available[1] = new Toy(130, "Car", "Toy", 1, 5, 100, 30, 20, 100);
        available[2] = new Toy(150, "Kite", "Toy", 3, 8, 100, 50, 20, 100);
        available[3] = new Toy(180, "Airplane", "Toy", 4, 7, 500, 30, 50, 20);
    }

    public void rent(int toyId) {
        for (int i = 0; i < 4; ++i)
            if (available[i].getToyId() == toyId) {
                System.out.println("Toy Name: " + available[i].getToyName());
                System.out.println("Toy Type: " + available[i].getToyType());
                System.out.println("Quantity: " + available[i].getQuantity());
                System.out.print("RentalAmount: " + available[i].getRentalAmount());
                break;
            }
    }

    public void display() {
    }
}

public class Source {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int toyId = in.nextInt();
        CustomerService obj = new CustomerServiceImpl();
        obj.rent(toyId);
        return;
    }
}