import java.util.InputMismatchException;
import java.util.Scanner;

public class Dragon {
    public static void main(String[] args) {
        int age;
        int eyes;
        int head = 3;
        try {
            Scanner scn = new Scanner(System.in);
            System.out.println("Please, input dragon's age ");
            age = scn.nextInt();
            if (age >= 0) {
                if (age / 200 < 1) {
                    head += age * 3;
                } else if (age / 200 >= 1 && age / 300 < 1) {
                    head += 200 * 3 + (age - 200) * 2;
                } else if (age / 300 >= 1) {
                    head += 200 * 3 + 100 * 2 + (age - 300);
                }
                eyes = head * 2;
                System.out.println("Dragon has " + head + " heads and " + eyes + " eyes");

            } else {
                System.out.println("age of dragon can't be negative");
            }
        } catch (InputMismatchException e) {
            System.out.println("You should input integer value");
        }
    }
}
