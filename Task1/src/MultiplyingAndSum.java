public class MultiplyingAndSum {
    public static int countDigitSum(int a) {
        int digit5 = a % 10;
        int digit4 = (a /= 10) % 10;
        int digit3 = (a /= 10) % 10;
        int digit2 = (a /= 10) % 10;
        int digit1 = a / 10;

        return digit1 + digit2 + digit3 + digit4 + digit5;
    }

    public static int countDigitMultiplying(int a) {
        int digit5 = a % 10;
        int digit4 = (a /= 10) % 10;
        int digit3 = (a /= 10) % 10;
        int digit2 = (a /= 10) % 10;
        int digit1 = a / 10;

        return digit1 * digit2 * digit3 * digit4 * digit5;
    }

    public static void run() {
        int a = 12345;
        System.out.println("Result of multiplying is " + countDigitMultiplying(a));
        System.out.println("Result of sum is " + countDigitSum(a));
    }
}

