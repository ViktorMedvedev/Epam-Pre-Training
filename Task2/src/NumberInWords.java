public class NumberInWords {
    public static String parseHundredInString(int number) {
        int hundreds = number / 100;
        if (number / 100 > 0) {
            switch (hundreds) {
                case 1:
                    return "Сто ";
                case 2:
                    return "Двести ";
                case 3:
                    return "Триста ";
                case 4:
                    return "Четыреста ";
                case 5:
                    return "Пятьсот ";
                case 6:
                    return "Шестьсот ";
                case 7:
                    return "Семьсот ";
                case 8:
                    return "Восемьсот ";
                default:
                    return "Девятьсот ";
            }
        } else {
            return "";
        }
    }

    public static String parseDecadesInString(int number) {
        int decades = (number / 10) % 10;
        int units = number % 10;
        if (number / 10 > 0) {
            switch (decades) {
                case 1:
                    switch (units) {
                        case 1:
                            return "одиннадцвть";
                        case 2:
                            return "двенадцать";
                        case 3:
                            return "тринадцать";
                        case 4:
                            return "четырнадцать";
                        case 5:
                            return "пятнадцать";
                        case 6:
                            return "шестнадцать";
                        case 7:
                            return "семнадцать";
                        case 8:
                            return "восемнадцать";
                        case 9:
                            return "девятнадцать";
                        default:
                            return "десять";
                    }
                case 2:
                    return "двадцать ";
                case 3:
                    return "тридцать ";
                case 4:
                    return "сорок ";
                case 5:
                    return "пятьдесят ";
                case 6:
                    return "шестьдесят ";
                case 7:
                    return "семьдесят ";
                case 8:
                    return "восемьдесят ";
                default:
                    return "девяноста ";
            }
        } else {
            return "";
        }

    }

    public static String parseUnitsInString(int number) {
        int units = number % 10;
        switch (units) {
            case 1:
                return "один";
            case 2:
                return "два";
            case 3:
                return "три";
            case 4:
                return "четыре";
            case 5:
                return "пять";
            case 6:
                return "шесть";
            case 7:
                return "семь";
            case 8:
                return "восемь";
            default:
                return "девять";
        }
    }

    public static String parseNumberInString(int number) {
        if (number > 0 && number < 1000) {

            if ((number / 10) % 10 == 1) {
                return parseHundredInString(number)
                        + parseDecadesInString(number);

            } else {
                return parseHundredInString(number)
                        + parseDecadesInString(number)
                        + parseUnitsInString(number);
            }
        } else {
            return "Number is out of borders";
        }
    }

    public static void run() {
        int number = 315;
        System.out.println(number);
        System.out.println(parseNumberInString(number));
    }
}
