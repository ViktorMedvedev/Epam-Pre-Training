import java.util.InputMismatchException;
import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        int a;
        int tenThousand;
        int thousand;
        int hundred;
        int decade;
        int unit;
        int product;
        int sum;
        System.out.println("There is five-digit integer value. " + "\r\n" +
                "The program will count results of multiplying and sum.");
        try {
            Scanner scn = new Scanner(System.in);
            System.out.println("Please, input five-digit integer value: ");
            a = scn.nextInt();
            tenThousand = a / 10000;
            thousand = (a - tenThousand * 10000) / 1000;
            hundred = (a - tenThousand * 10000 - thousand * 1000) / 100;
            decade = (a - tenThousand * 10000 - thousand * 1000 - hundred * 100) / 10;
            unit = (a - tenThousand * 10000 - thousand * 1000 - hundred * 100 - decade * 10);
            product = tenThousand * thousand * hundred * decade * unit;
            sum = tenThousand + thousand + hundred + decade + unit;
            System.out.println("Result of multiplying is: " + product + ", result of sum is: " + sum);

        } catch (InputMismatchException e) {
            System.out.println("Error. Please input integer values");
        }
    }
}

