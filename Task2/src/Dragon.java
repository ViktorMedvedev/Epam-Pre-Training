public class Dragon {
    private static final int EYES_ON_HEAD = 2;
    private static final int YOUTH = 200;
    private static final int MIDDLE = 300;
    private static final int HEADS_PER_YEAR_IN_CHILDHOOD = 3;
    private static final int HEADS_PER_YEAR_IN_YOUTH = 2;
    private static final int HEADS_PER_YEAR_IN_MEDDLE_AGE = 1;

    public static int countHeadsOgDragon(int age) {
        if (age < YOUTH) {
            return (age + 1) * HEADS_PER_YEAR_IN_CHILDHOOD;
        } else if (age < MIDDLE) {
            return (YOUTH + 1) * HEADS_PER_YEAR_IN_CHILDHOOD
                    + (age - YOUTH) * HEADS_PER_YEAR_IN_YOUTH;
        } else {
            return (YOUTH + 1) * HEADS_PER_YEAR_IN_CHILDHOOD
                    + (MIDDLE - YOUTH) * HEADS_PER_YEAR_IN_YOUTH
                    + (age - MIDDLE) * HEADS_PER_YEAR_IN_MEDDLE_AGE;
        }
    }

    public static int countEyesOfDragon(int age) {
        return countHeadsOgDragon(age) * EYES_ON_HEAD;
    }
    public static void run(){
        int age = 400;
        System.out.println("Dragon with age of " + age + " has "
                + countHeadsOgDragon(age) + " heads and "
                + countEyesOfDragon(age) + " eyes");

    }
}
