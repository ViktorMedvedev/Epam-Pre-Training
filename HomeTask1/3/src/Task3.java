import java.util.InputMismatchException;
import java.util.Scanner;


public class Task3 {
    public static void main(String[] args) {
        int a;
        int b;
        System.out.println("There are two variables. " + "\r\n" +
                "The program will swap values without using third variable.");
        try {
            Scanner scn = new Scanner(System.in);
            System.out.println("Please, input integer variable a: ");
            a = scn.nextInt();
            System.out.println("Please, input integer variable b: ");
            b = scn.nextInt();
            System.out.println("Initial values of variables: a = " + a + ", b = " + b);
            a = b+a-(b=a);
            System.out.println("Final values of variables: a = " + a + ", b = " + b);

        } catch (InputMismatchException e) {
            System.out.println("Error. Please input integer values");
        }
    }
}
