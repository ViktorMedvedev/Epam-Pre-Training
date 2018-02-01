import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberInWords {
    public static void main(String[] args) {
        System.out.println("The program will determine tomorrow's day");
        int hundreds;
        int decades;
        int units;
        String hundredsInString;
        String decadesInString;
        String unitsInString;
        String output;
        try {
            Scanner scn = new Scanner(System.in);
            System.out.println("Input number from 1 to 999");
            int number = scn.nextInt();
            if (number > 0 && number < 1000) {
                units = number % 10;
                hundreds = number / 100;
                decades = (number / 10) % 10;
                if (number / 100 > 0) {
                    switch (hundreds) {
                        case 1:
                            hundredsInString = "Сто ";
                            break;
                        case 2:
                            hundredsInString = "Двести ";
                            break;
                        case 3:
                            hundredsInString = "Триста ";
                            break;
                        case 4:
                            hundredsInString = "Четыреста ";
                            break;
                        case 5:
                            hundredsInString = "Пятьсот ";
                            break;
                        case 6:
                            hundredsInString = "Шестьсот ";
                            break;
                        case 7:
                            hundredsInString = "Семьсот ";
                            break;
                        case 8:
                            hundredsInString = "Восемьсот ";
                            break;
                        default:
                            hundredsInString = "Девятьсот ";
                            break;
                    }
                } else {
                    hundredsInString = "";
                }
                if (number / 10 > 0) {
                    switch (decades) {
                        case 1:
                            switch (units) {
                                case 1:
                                    decadesInString = "одиннадцвть";
                                    break;
                                case 2:
                                    decadesInString = "двенадцать";
                                    break;
                                case 3:
                                    decadesInString = "тринадцать";
                                    break;
                                case 4:
                                    decadesInString = "четырнадцать";
                                    break;
                                case 5:
                                    decadesInString = "пятнадцать";
                                    break;
                                case 6:
                                    decadesInString = "шестнадцать";
                                    break;
                                case 7:
                                    decadesInString = "семнадцать";
                                    break;
                                case 8:
                                    decadesInString = "восемнадцать";
                                    break;
                                case 9:
                                    decadesInString = "девятнадцать";
                                    break;
                                default:
                                    decadesInString = "десять";
                                    break;
                            }
                            break;
                        case 2:
                            decadesInString = "двадцать ";
                            break;
                        case 3:
                            decadesInString = "тридцать ";
                            break;
                        case 4:
                            decadesInString = "сорок ";
                            break;
                        case 5:
                            decadesInString = "пятьдесят ";
                            break;
                        case 6:
                            decadesInString = "шестьдесят ";
                            break;
                        case 7:
                            decadesInString = "семьдесят ";
                            break;
                        case 8:
                            decadesInString = "восемьдесят ";
                            break;
                        default:
                            decadesInString = "девяноста ";
                            break;

                    }
                } else {
                    decadesInString = "";
                }
                switch (units) {
                    case 1:
                        unitsInString = "один";
                        break;
                    case 2:
                        unitsInString = "два";
                        break;
                    case 3:
                        unitsInString = "три";
                        break;
                    case 4:
                        unitsInString = "четыре";
                        break;
                    case 5:
                        unitsInString = "пять";
                        break;
                    case 6:
                        unitsInString = "шесть";
                        break;
                    case 7:
                        unitsInString = "семь";
                        break;
                    case 8:
                        unitsInString = "восемь";
                        break;
                    default:
                        unitsInString = "девять";
                        break;

                }

                if (decades == 1) {
                    output = hundredsInString + decadesInString;

                } else {
                    output = hundredsInString + decadesInString + unitsInString;
                }


            } else {
                output = "Input number is out of borders!";
            }
            System.out.println(output);
        } catch (InputMismatchException e) {
            System.out.println("You should input integer values!");
        }
    }
}
