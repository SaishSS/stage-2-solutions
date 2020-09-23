import java.util.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class InvalidAgeException extends RuntimeException {
    private static final long serialVersionUID = -1510453123644668900L;

    public InvalidAgeException(String message) {
        super(message);
    }
}

class Toy {
    private int id, minAge, maxAge;
    private String name;

    public Toy() {
    }

    public Toy(int id, String name, int minAge, int maxAge) throws InvalidAgeException {
        if (minAge < 0 || maxAge > 12)
            throw new InvalidAgeException("InvalidAgeException");
        else {
            this.id = id;
            this.name = name;
            this.minAge = minAge;
            this.maxAge = maxAge;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMaxAge() {
        return maxAge;
    }

    public int getMinAge() {
        return minAge;
    }

    public void setMinAge(int minAge) throws InvalidAgeException {
        if (minAge < 0)
            throw new InvalidAgeException("InvalidAgeException");
        this.minAge = minAge;
    }

    public void setMaxAge(int maxAge) throws InvalidAgeException {
        if (maxAge > 12)
            throw new InvalidAgeException("InvalidAgeException");
        this.maxAge = maxAge;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getToyName() {
        return name;
    }

    public void setToyName(String name) {
        this.name = name;
    }

}

public class Source {
    String toys[][] = new String[5][5];

    Source() {
        toys[0][0] = "1";
        toys[0][1] = "Stickle Bricks";

        toys[1][0] = "2";
        toys[1][1] = "Robot Dog";

        toys[2][0] = "3";
        toys[2][1] = "Magic 8 Ball";

        toys[3][0] = "4";
        toys[3][1] = "Juggling Clubs";

        toys[4][0] = "5";
        toys[4][1] = "Chutes and Ladders";
    }

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int id = Integer.parseInt(in.nextLine());
        String name = in.nextLine();
        int minAge = Integer.parseInt(in.nextLine());
        int maxAge = Integer.parseInt(in.nextLine());
        try {
            Toy toy = new Toy(id, name, minAge, maxAge);
            System.out.println(toy.getToyName());
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
        return;
    }
}