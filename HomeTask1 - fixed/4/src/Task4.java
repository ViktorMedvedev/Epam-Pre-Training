import java.util.InputMismatchException;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int a;
        int thousand;
        int hundred;
        int decade;
        int unit;
        String s;

        System.out.println("There is four-digit integer value. " + "\r\n" +
                "The program will check, that digits in number are in increasing order.");
        try {
            Scanner scn = new Scanner(System.in);
            System.out.println("Please, input four-digit integer value: ");
            a = scn.nextInt();
            thousand = a / 1000;
            hundred = (a - thousand * 1000) / 100;
            decade = (a - thousand * 1000 - hundred * 100) / 10;
            unit = a - thousand * 1000 - hundred * 100 - decade * 10;
            s = thousand < hundred && hundred < decade && decade < unit ? "Matches!" : "mismatches";
            System.out.println(s);

        } catch (InputMismatchException e) {
            System.out.println("Error. Please input integer values");
        }
    }
}
