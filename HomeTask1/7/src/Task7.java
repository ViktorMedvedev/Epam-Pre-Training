import java.util.InputMismatchException;
import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {
        int a;
        int million;
        int hundredThousand;
        int tenThousand;
        int thousand;
        int hundred;
        int decade;
        int unit;
        int newValue;
        System.out.println("There is seven-digit integer value. " + "\r\n" +
                "The program will count average and geometric average of digits.");
        try {
            Scanner scn = new Scanner(System.in);
            System.out.println("Please, input six-digit integer value: ");
            a = scn.nextInt();
            if (a / 1000000 >= 1 && a / 10000000 == 0) {
                million = a / 1000000;
                hundredThousand = (a - a / 1000000 * 1000000) / 100000;
                tenThousand = (a - a / 100000 * 100000) / 10000;
                thousand = (a - a / 10000 * 10000) / 1000;
                hundred = (a - a / 1000 * 1000) / 100;
                decade = (a - a / 100 * 100) / 10;
                unit = (a - a / 10 * 10);
                newValue = million
                        + hundredThousand * 10
                        + tenThousand * 100
                        + thousand * 1000
                        + hundred * 10000
                        + decade * 100000
                        + unit * 1000000;
                System.out.println(newValue);
            } else {
                System.out.println("It is not seven-digit value.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Error. Please input integer values");
        }
    }
}
