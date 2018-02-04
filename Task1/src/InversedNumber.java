public class InversedNumber {
    public static int inverseNumber(int a) {
        int digit7 = a % 10;
        int digit6 = (a /= 10) % 10;
        int digit5 = (a /= 10) % 10;
        int digit4 = (a /= 10) % 10;
        int digit3 = (a /= 10) % 10;
        int digit2 = (a /= 10) % 10;
        int digit1 = a / 10;

        return digit1
                + digit2 * 10
                + digit3 * 100
                + digit4 * 1000
                + digit5 * 10_000
                + digit6 * 100_000
                + digit7 * 1_000_000;
    }

    public static void run() {
        int a = 1234567;
        System.out.println("Number is " + a);
        System.out.println("Inversed number is " + inverseNumber(a));
    }
}
