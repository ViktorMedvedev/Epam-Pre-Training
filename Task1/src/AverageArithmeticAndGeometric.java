public class AverageArithmeticAndGeometric {
    public static double countAverageArithmetic(int a) {
        int digit6 = a % 10;
        int digit5 = (a /= 10) % 10;
        int digit4 = (a /= 10) % 10;
        int digit3 = (a /= 10) % 10;
        int digit2 = (a /= 10) % 10;
        int digit1 = a / 10;

        return (digit1 + digit2 + digit3 + digit4 + digit5 + digit6) / 6.0;
    }

    public static double countAverageGeometric(int a) {
        int digit6 = a % 10;
        int digit5 = (a /= 10) % 10;
        int digit4 = (a /= 10) % 10;
        int digit3 = (a /= 10) % 10;
        int digit2 = (a /= 10) % 10;
        int digit1 = a / 10;

        return Math.pow(10, ((Math.log10(digit1)
                + Math.log10(digit2)
                + Math.log10(digit3)
                + Math.log10(digit4)
                + Math.log10(digit5)
                + Math.log10(digit6)) / 6.0));
    }

    public static void run() {
        int a = 123456;
        System.out.println("Average arithmetic is " + countAverageArithmetic(a));
        System.out.println("Average geometric is " + countAverageGeometric(a));
    }
}

