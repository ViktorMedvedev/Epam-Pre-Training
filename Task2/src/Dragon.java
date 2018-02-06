public class Dragon {
    private static final int EYES_ON_HEAD = 2;
    private static final int YOUTH = 200;
    private static final int MIDDLE = 300;
    private static final int HEADS_PER_YEAR_IN_CHILDHOOD = 3;
    private static final int HEADS_PER_YEAR_IN_YOUTH = 2;
    private static final int HEADS_PER_YEAR_IN_MIDDLE_AGE = 1;

    public static int countHeadsOgDragon(int ageOfDragon) {
        int heads = 3;
        if (ageOfDragon > 0) {
            if (ageOfDragon < YOUTH) {
                heads += ageOfDragon * HEADS_PER_YEAR_IN_CHILDHOOD;
            } else if (ageOfDragon < MIDDLE) {
                heads += ageOfDragon * HEADS_PER_YEAR_IN_YOUTH
                        + YOUTH * HEADS_PER_YEAR_IN_CHILDHOOD - YOUTH * HEADS_PER_YEAR_IN_YOUTH;
            } else {
                heads += ageOfDragon * HEADS_PER_YEAR_IN_MIDDLE_AGE
                        + MIDDLE * HEADS_PER_YEAR_IN_YOUTH - MIDDLE * HEADS_PER_YEAR_IN_MIDDLE_AGE
                        + YOUTH * HEADS_PER_YEAR_IN_CHILDHOOD - YOUTH * HEADS_PER_YEAR_IN_YOUTH;
            }
            return heads;
        } else {
            return 0;
        }
    }

    public static int countEyesOfDragon(int age) {
        return countHeadsOgDragon(age) * EYES_ON_HEAD;
    }
}

