public class VowelOrConsonant {

    public static String defineVowelOrConsonant1(char c) {
        switch (c) {
            case 'a':
            case 'i':
            case 'e':
            case 'o':
            case 'u':
                return "vowel";
            case 'y':
                return "both";
            default:
                return "consonant";
        }
    }

    public static String defineVowelOrConsonant2(char c) {
        if (c == 'a'
                || c == 'i'
                || c == 'e'
                || c == 'o'
                || c == 'u') {
            return "vowel";
        } else if (c == 'y') {
            return "both";
        } else {
            return "consonant";
        }
    }

    public static String defineVowelOrConsonant3(char c) {
        if ((c + "").equals("a")
                || (c + "").equals("i")
                || (c + "").equals("e")
                || (c + "").equals("o")
                || (c + "").equals("u")) {
            return "vowel";
        } else if ((c + "").equals("y")) {
            return "both";
        } else {
            return "consonant";
        }
    }

    public static String defineVowelOrConsonant4(char c) {
        String vowels = "aieou";
        String both = "y";
        if (vowels.contains(c + "")) {
            return "vowel";
        } else if (both.contains(c + "")) {
            return "both";
        } else {
            return "consonant";
        }
    }

    public static void run() {
        char c1 = 'a';
        System.out.println(c1 + " is " + defineVowelOrConsonant1(c1));
        char c2 = 'b';
        System.out.println(c2 + " is " + defineVowelOrConsonant2(c2));
        char c3 = 'c';
        System.out.println(c3 + " is " + defineVowelOrConsonant3(c3));
        char c4 = 'y';
        System.out.println(c4 + " is " + defineVowelOrConsonant4(c4));
    }
}

