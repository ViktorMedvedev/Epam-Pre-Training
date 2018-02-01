import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, input ONE LATIN LETTER." + "\r\n" +
                "The program will define if this letter is vowel or consonant.");
        String input = scanner.next();
        char a = input.toLowerCase().charAt(0);
        String s;
        if (input.length() == 1) {
            if ((a >= 'a' && a <= 'z')) {
                switch (a) {
                    case 'a':
                    case 'i':
                    case 'e':
                    case 'o':
                    case 'u':
                        s = "vowel";
                        break;
                    case 'y':
                        s = "both";
                        break;
                    default:
                        s = "consonant";
                        break;
                }
            } else {
                s = "It is not a latin letter, or it is not a letter at all.";
            }
            System.out.println(s);
        } else {
            System.out.println("This is not a single character");
        }
    }
}

