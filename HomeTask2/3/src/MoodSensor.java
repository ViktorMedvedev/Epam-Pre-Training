public class MoodSensor {
    public static void main(String[] args) {
        System.out.println("The program tries to determine your mood.");
        int a = (int) (Math.random() * 5);
        String s;
        if (a < 1) {
            s = "(´･_･`)";
        } else if (a < 2) {
            s = "(ﾉ◕ヮ◕)ﾉ";
        } else if (a < 3) {
            s = "( ⚆ _ ⚆ )";
        } else if (a < 4) {
            s = "(⌐■_■)";
        } else {
            s = "¯\\_(ツ)_/¯";
        }
        System.out.println(s);
    }
}
