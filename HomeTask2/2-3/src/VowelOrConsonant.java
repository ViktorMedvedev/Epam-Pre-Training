import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, input ONE LATIN LETTER." + "\r\n" +
                "The program will define of this letter is vowel or consonant.");
        String a = scanner.next();
        String aLowerCase = a.toLowerCase();
        String vowels = "aieou";
        String consonants = "bcdfghjklmnpqrstvwxz";
        String both = "y";
        String s;
        if (a.length() == 1) {
            if (vowels.contains(aLowerCase)) {
                s = "vowel";
            } else if (consonants.contains(aLowerCase)) {
                s = "consonant";
            } else if (both.contains(aLowerCase)) {
                s = "both";
            } else {
                s = "It is not a latin letter, or it is not a letter at all.";
            }
            System.out.println(s);
        } else {
            System.out.println("You should input only one symbol!");
        }
    }
}



