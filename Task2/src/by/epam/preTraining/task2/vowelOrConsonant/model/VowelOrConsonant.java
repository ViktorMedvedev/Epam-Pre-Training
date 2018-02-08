package by.epam.preTraining.task2.vowelOrConsonant.model;

public class VowelOrConsonant {
    public static final String VOWELS_LOW_REGISTRY = "aieouy";

    public static String defineVowelOrConsonant1(char ch) {
        char c = (ch + "").toLowerCase().charAt(0);
        String output;
        if (c >= 'a' && c <= 'z') {
            switch (c) {
                case 'a':
                case 'i':
                case 'e':
                case 'o':
                case 'u':
                case 'y':
                    output = "vowel";
                    break;
                default:
                    output = "consonant";
                    break;
            }
        } else {
            output = "This is not a latin letter";
        }
        return output;
    }

    public static String defineVowelOrConsonant2(char ch) {

        char c = (ch + "").toLowerCase().charAt(0);
        String output;
        if (c >= 'a' && c <= 'z') {
            if (c == 'a'
                    || c == 'i'
                    || c == 'e'
                    || c == 'o'
                    || c == 'u'
                    || c == 'y') {
                output = "vowel";
            } else {
                output = "consonant";
            }
            return output;
        } else {
            output = "This is not a latin letter";
        }
        return output;
    }

    public static String defineVowelOrConsonant3(char ch) {
        char c = (ch + "").toLowerCase().charAt(0);
        String output;
        if (c >= 'a' && c <= 'z') {
            output = c == 'a'
                    || c == 'i'
                    || c == 'e'
                    || c == 'o'
                    || c == 'u'
                    || c == 'y' ? "vowel" : "consonant";
        } else {
            output = "This is not a latin letter";
        }
        return output;
    }


    public static String defineVowelOrConsonant4(char ch) {
        char c = (ch + "").toLowerCase().charAt(0);
        String output;
        if (c >= 'a' && c <= 'z') {
            if (VOWELS_LOW_REGISTRY.contains(c + "")) {
                output = "vowel";
            } else {
                output = "consonant";
            }
        } else {
            output = "This is not a latin letter";
        }
        return output;
    }

}

