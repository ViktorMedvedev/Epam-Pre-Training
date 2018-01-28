import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        double weightInGrams;
        double weightInKilograms;
        double weightInTons;
        String formattedKilograms;
        String formattedTons;
        System.out.println("Please, input dinosaur weight in grams. " + "\r\n" +
                "The program will return weight in kilograms and tons. ");
        try {
            Scanner scn = new Scanner(System.in);
            weightInGrams = scn.nextInt();
            if (weightInGrams >= 10000) {
                weightInKilograms = weightInGrams / 1000;
                weightInTons = weightInGrams / 1000000;
                formattedKilograms = String.format("%.2f", weightInKilograms);
                formattedTons = String.format("%.2f", weightInTons);
                System.out.println("The weight in kilograms is " + formattedKilograms + "." + "\r\n" +
                        "The weight in tons is " + formattedTons + ".");
            } else {
                System.out.println("This is not enough even for newborn dinosaur. " +
                        "Please, input weight at least 10 kilograms.");
            }


        } catch (InputMismatchException e) {
            System.out.println("Error. Please input integer value.");
        }
    }
}
