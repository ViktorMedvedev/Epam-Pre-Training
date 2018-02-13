package by.epam.preTraining.task4.hanoiTower.model;

public class HanoiTower {
    public static String moveDisk(char a, char b) {
        return a + "-->" + b;
    }

    public static void moveTower(int n, char a, char b, char c) {
        if (n > 0) {
            moveTower(n - 1, a, c, b);
            System.out.println(moveDisk(a, b) + "\r\n");
            moveTower(n - 1, c, b, a);
        }
    }
}
