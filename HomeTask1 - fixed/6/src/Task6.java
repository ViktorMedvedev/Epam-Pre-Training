import java.util.InputMismatchException;
import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {
        int a;
        int hundredThousand;
        int tenThousand;
        int thousand;
        int hundred;
        int decade;
        int unit;
        double averageGeometric;
        double average;
        System.out.println("There is six-digit integer value. " + "\r\n" +
                "The program will count average and geometric average of digits.");
        try {
            Scanner scn = new Scanner(System.in);
            System.out.println("Please, input six-digit integer value: ");
            a = scn.nextInt();
            hundredThousand = a / 100000;
            tenThousand = (a - a / 100000 * 100000) / 10000;
            thousand = (a - a / 10000 * 10000) / 1000;
            hundred = (a - a / 1000 * 1000) / 100;
            decade = (a - a / 100 * 100) / 10;
            unit = (a - a / 10 * 10);
            averageGeometric = Math.pow(hundredThousand * tenThousand * thousand * hundred * decade * unit, 1.0 / 6);
            average = (hundredThousand + tenThousand + thousand + hundred + decade + unit) / 6;
            System.out.println("Average is: " + String.format("%.2f", average) +
                    "; average geometric is: " + String.format("%.2f", averageGeometric));

        } catch (InputMismatchException e) {
            System.out.println("Error. Please input integer values");
        }
    }
}
