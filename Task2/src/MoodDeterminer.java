import java.util.Random;

public class MoodDeterminer {
    public static final int MAX_VALUE = 5;

    public static String determineYourMood() {
        Random random = new Random();
        int a = random.nextInt(MAX_VALUE);
        String output;
        switch (a) {
            case 1:
                output = "(´･_･`)";
                break;
            case 2:
                output = "(ﾉ◕ヮ◕)ﾉ";
                break;
            case 3:
                output = "( ⚆ _ ⚆ )";
                break;
            case 4:
                output = "(⌐■_■)";
                break;
            default:
                output = "¯\\_(ツ)_/¯";
                break;
        }
        return output;
    }

}
