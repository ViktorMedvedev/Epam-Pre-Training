public class VariablesSwapper {
    public static void run() {
        int a = 4;
        int b = 6;
        System.out.println("a = " + a + "; b = " + b);
        swapVariables(a, b);

    }

    public static void swapVariables(int a, int b) {
        a = b + a - (b = a);
        System.out.println("Now a = " + a + "; b =  " + b);
    }
}


