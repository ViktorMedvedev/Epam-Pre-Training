public class IncerasingOrderChecker {
    public static boolean isDigitsAreInIncreasingOrder(int a) {
        int digit4 = a % 10;
        int digit3 = (a /= 10) % 10;
        int digit2 = (a /= 10) % 10;
        int digit1 = (a / 10) ;
        return digit1 < digit2 && digit2 < digit3 && digit3 < digit4;
    }

    public static void run() {
        int a = 3456;
        System.out.println(isDigitsAreInIncreasingOrder(a) ? "Matches" : "Mismatches");
    }
}
