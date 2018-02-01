import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, input ONE LATIN LETTER." + "\r\n" +
                "The program will define of this letter is vowel or consonant.");
        String a = scanner.next();
        char aLowerCase = a.toLowerCase().charAt(0);
        String s;
        if (a.length() == 1) {
            if (aLowerCase == 'a' || aLowerCase == 'i' || aLowerCase == 'e' || aLowerCase == 'o' || aLowerCase == 'u') {
                s = "vowel";
            } else if (aLowerCase == 'y') {
                s = "both";
            } else if (aLowerCase >= 'a' && aLowerCase <= 'z') {
                s = "consonant";
            } else {
                s = "It is not a latin letter, or it is not a letter at all.";
            }
            System.out.println(s);
        } else {
            System.out.println("You should input only one symbol!");
        }
    }
}



