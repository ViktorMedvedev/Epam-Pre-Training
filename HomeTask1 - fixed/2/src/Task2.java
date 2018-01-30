import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        double r1;
        double r2;
        double areaOfRing;
        String formattedArea;
        System.out.println("There are 2 circles with common center on plane. R1>R2. " + "\r\n" +
                "The program will count area of received ring.");
        try {
            Scanner scn = new Scanner(System.in);
            System.out.println("Please, input R1.");
            r1 = scn.nextDouble();
            System.out.println("Please, input R2");
            r2 = scn.nextDouble();
            areaOfRing = Math.PI * (r1 * r1 - r2 * r2);
            formattedArea = String.format("%.2f", areaOfRing);
            System.out.println("The area of circle is " + formattedArea);

        } catch (InputMismatchException e) {
            System.out.println("Error. Please input numbers");
        }
    }
}

