public class MoodDeterminer {
    public static String determineYourMood(){
        int a = (int) (Math.random() * 5);
        if (a == 1) {
            return "(´･_･`)";
        } else if (a == 2) {
            return "(ﾉ◕ヮ◕)ﾉ";
        } else if (a == 3) {
            return "( ⚆ _ ⚆ )";
        } else if (a == 4) {
            return "(⌐■_■)";
        } else {
            return "¯\\_(ツ)_/¯";
        }
    }
    public static void run(){
        System.out.println("I think your mood is like " + determineYourMood());
    }
}
