public class NumberInWords {

    public static String parseHundredInString(int number) {
        int hundreds = number / 100;
        String hundredsInString = "";
        if (hundreds > 0) {
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
                case 9:
                    hundredsInString = "Девятьсот ";
                    break;
            }
        }
        return hundredsInString;
    }

    public static String parseDecadesInString(int number) {
        int decades = (number / 10) % 10;
        int units = number % 10;
        String decadesInString = "";
        if (decades > 0) {
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
                case 9:
                    decadesInString = "девяноста ";
                    break;

            }
        }
        return decadesInString;
    }

    public static String parseUnitsInString(int number) {
        int units = number % 10;
        String unitsInString = "";
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
            case 9:
                unitsInString = "девять";
                break;

        }
        return unitsInString;
    }

    public static String parseNumberInString(int number) {
        String output;
        if (number > 0 && number < 1000) {
            if ((number / 10) % 10 == 1) {
                output = parseHundredInString(number)
                        + parseDecadesInString(number);
            } else {
                output = parseHundredInString(number)
                        + parseDecadesInString(number)
                        + parseUnitsInString(number);
            }
        } else {
            output = "Number is out of borders";
        }
        return output;
    }
}
