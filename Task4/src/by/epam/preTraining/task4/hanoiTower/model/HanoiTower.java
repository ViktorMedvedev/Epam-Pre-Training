package by.epam.preTraining.task4.hanoiTower.model;

public class HanoiTower {
    public static String moveTower(int n, char a, char b, char c) {
        if (n > 0) {
            return moveTower(n - 1, a, c, b)
                    + a + "-->" + b + "\r\n"
                    + moveTower(n - 1, c, b, a);
        }
        return "";
    }
}
