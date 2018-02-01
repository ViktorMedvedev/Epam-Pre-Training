import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, input ONE LATIN LETTER." + "\r\n" +
                "The program will define of this letter is vowel or consonant.");
        String a = scanner.next();
        String aLowerCase = a.toLowerCase();
        String s;
        if (a.length() == 1) {
            if (aLowerCase.charAt(0) >= 'a' && aLowerCase.charAt(0) <= 'z') {
                if (aLowerCase.equals("а")
                        || aLowerCase.equals("a")
                        || aLowerCase.equals("i")
                        || aLowerCase.equals("e")
                        || aLowerCase.equals("o")
                        || aLowerCase.equals("u")) {
                    s = "vowel";
                } else if (aLowerCase.equals("y")) {
                    s = "both";

                } else {
                    s = "consonant";
                }
            } else {
                s = "It is not a latin letter, or it is not a letter at all.";
            }
            System.out.println(s);
        } else {
            System.out.println("You should input only one symbol!");
        }
    }
}



