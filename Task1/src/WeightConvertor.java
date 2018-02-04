public class WeightConvertor {
    private static final double GRAMS_TO_KILOGRAMS = 1000;
    private static final double GRAMS_TO_TONS = 1_000_000;

    public static double dinosaurWeightInKilograms(double dinosaurWeight) {
        return dinosaurWeight / GRAMS_TO_KILOGRAMS;
    }

    public static double dinosaurWeightInTons(double dinosaurWeight) {
        return dinosaurWeight / GRAMS_TO_TONS;
    }

    public static void run() {
        double mass = 1_234_567;
        System.out.println("The weight in kilograms is " + dinosaurWeightInKilograms(mass));
        System.out.println("The weight in tons is " + dinosaurWeightInTons(mass));

    }
}