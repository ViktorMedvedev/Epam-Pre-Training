import java.util.InputMismatchException;
import java.util.Scanner;

public class DeterminatorOfTomorrow {
    public static void main(String[] args) {
        System.out.println("The program will determine tomorrow's day");
        try {
            Scanner scn = new Scanner(System.in);
            System.out.println("Input day");
            int day = scn.nextInt();
            System.out.println("Input month");
            int month = scn.nextInt();
            System.out.println("Input year");
            int year = scn.nextInt();
            int max;
            String output;
            switch (month) {
                case 4:
                case 6:
                case 9:
                case 11:
                    max = 30;
                    break;
                case 2:
                    if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0)) {
                        max = 29;
                    } else {
                        max = 28;
                    }
                    break;
                default:
                    max = 31;
                    break;
            }
            if (day > 0 && day <= max) {
                if (day != max) {
                    day++;
                } else {
                    day = 1;
                    if (month != 12) {
                        month++;
                    } else {
                        month = 1;
                        year++;
                    }
                }
                output = day + "." + month + "." + year;

            } else {
                output = "There is no such day in present-day calendar!";
            }
            System.out.println(output);
        } catch (InputMismatchException e) {
            System.out.println("You should input integer values!");
        }
    }
}



