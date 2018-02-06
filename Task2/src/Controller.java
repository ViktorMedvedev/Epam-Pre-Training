public class Controller {
    public static void main(String[] args) {
        //task1
        View.print("Task1: ");
        int age = 400;
        View.print("Number of heads of dragon with age of " + age
                + " is " + Dragon.countHeadsOgDragon(age)
                + "; number of eyes is " + Dragon.countEyesOfDragon(age));
        //task2
        View.print("Task2: ");
        char c1 = 'a';
        View.print(c1 + " is " + VowelOrConsonant.defineVowelOrConsonant1(c1));
        char c2 = 'b';
        View.print(c2 + " is " + VowelOrConsonant.defineVowelOrConsonant2(c2));
        char c3 = 'c';
        View.print(c3 + " is " + VowelOrConsonant.defineVowelOrConsonant3(c3));
        char c4 = 'y';
        View.print(c4 + " is " + VowelOrConsonant.defineVowelOrConsonant4(c4));
        //task3
        View.print("Task3: ");
        View.print("I think your mood is like " + MoodDeterminer.determineYourMood());
        //task4
        View.print("Task4: ");
        int day = 23;
        int month = 12;
        int year = 1997;
        View.print("Today is " + day + "." + month + "." + year);
        View.print("Tomorrow is " + TomorrowDate.determineTomorrowDate(day, month, year));
        //task5
        View.print("Task5: ");
        int number = 200;
        View.print(number + "");
        View.print(NumberInWords.parseNumberInString(number));
    }
}
