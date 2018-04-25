package by.medvedev.task1.validator;

import by.medvedev.task1.entity.Cone;
import by.medvedev.task1.entity.Point;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
    private final static String CORRECT_FORMAT = "(\\s*\\d+[.]?\\d*\\s*)(\\s*-?\\d+[.]?\\d*\\s*){6}(\\s*\\d+[.]?\\d*\\s*)";
    private final static String NOT_ENOUGH_DATA = "(\\s*\\d+[.]?\\d*\\s*){0,7}";
    private final static String WRONG_SYMBOLS = ".*[A-Za-z:;?!+~%$#@^\'\"><()*_`,].*";
    private final static String NEGATIVE_RADIUS = "\\s*-\\d+[.]?\\d*\\s*.*";
    private final static String NEGATIVE_COST = ".*\\s*-\\d+[.]?\\d*\\s*";

    public static boolean checkWrongRadius(String string) {
        Pattern p = Pattern.compile(NEGATIVE_RADIUS);
        Matcher m = p.matcher(string);
        return m.matches();
    }

    public static boolean checkWrongCost(String string) {
        Pattern p = Pattern.compile(NEGATIVE_COST);
        Matcher m = p.matcher(string);
        return m.matches();
    }

    public static boolean isCorrectDataFormat(String string) {
        Pattern p = Pattern.compile(CORRECT_FORMAT);
        Matcher m = p.matcher(string);
        return m.matches();
    }

    public static boolean containWrongSymbols(String string) {
        Pattern p = Pattern.compile(WRONG_SYMBOLS);
        Matcher m = p.matcher(string);
        return m.matches();
    }

    public static boolean notEnoughData(String string) {
        Pattern p = Pattern.compile(NOT_ENOUGH_DATA);
        Matcher m = p.matcher(string);
        return m.matches();
    }

    public static boolean isAdequateDiapason(Cone cone) {
        double baseCenterX = cone.getBaseCenter().getX();
        double baseCenterY = cone.getBaseCenter().getY();
        double baseCenterZ = cone.getBaseCenter().getZ();
        double topX = cone.getTop().getX();
        double topY = cone.getTop().getY();
        double topZ = cone.getTop().getZ();
        double radius = cone.getRadius();
        double cost = cone.getCost();
        return baseCenterX >= -1000 && baseCenterX <= 1000
                && baseCenterY >= -1000 && baseCenterY <= 1000
                && baseCenterZ >= -1000 && baseCenterZ <= 1000
                && topX >= -1000 && topX <= 1000
                && topY >= -1000 && topY <= 1000
                && topZ >= -1000 && topZ <= 1000
                && cost >= -10000 && cost <= 10000
                && radius >= -1000 && radius <= 1000;
    }


}
