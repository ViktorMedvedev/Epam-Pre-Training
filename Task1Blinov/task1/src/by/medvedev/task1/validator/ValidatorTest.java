package by.medvedev.task1.validator;

import by.medvedev.task1.entity.Cone;
import by.medvedev.task1.entity.Point;
import by.medvedev.task1.factory.ShapeFactory;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class ValidatorTest {
    private String checkString;
    private boolean condition;

    @Test
    public void checkWrongRadiusTrue() {
        checkString = "-2.0 1.0 5.0 3.0 1.0 2.0 3.0 150";
        boolean condition = Validator.checkWrongRadius(checkString);
        AssertJUnit.assertTrue(condition);
    }

    @Test
    public void checkWrongRadiusFalse() {
        checkString = "2.0 1.0 2.0 3.0 1.0 2.0 5.0 150.5";
        condition = Validator.checkWrongRadius(checkString);
        AssertJUnit.assertFalse(condition);
    }

    @Test
    public void checkWrongCostTrue() {
        checkString = "-20 1.0 2.0 3.0 1.0 2.0 5.0 -150.5";
        boolean condition = Validator.checkWrongCost(checkString);
        AssertJUnit.assertTrue(condition);
    }

    @Test
    public void checkWrongCostFalse() {
        checkString = "2.0 1.0 2.0 3.0 1.0 2.0 5.0 150.5";
        condition = Validator.checkWrongCost(checkString);
        AssertJUnit.assertFalse(condition);
    }

    @Test
    public void isCorrectDataFormatTrue() {
        checkString = "2.0 1.0 2.0 3.0 1.0 2.0 5.0 150.5";
        condition = Validator.isCorrectDataFormat(checkString);
        AssertJUnit.assertTrue(condition);
    }

    @Test
    public void isCorrectDataFormatFalse() {
        checkString = "13.2 12.1, 13.3, 1.2";
        condition = Validator.isCorrectDataFormat(checkString);
        AssertJUnit.assertFalse(condition);
    }

    @Test
    public void containWrongSymbolsTrue() {
        checkString = "4.0 12.4x 6.3 3.5 13.1 6.3 3.5";
        condition = Validator.containWrongSymbols(checkString);
        AssertJUnit.assertTrue(condition);
    }

    @Test
    public void containWrongSymbolsFalse() {
        checkString = "2.0 1.0 2.0 3.0 1.0 2.0 5.0 150.5";
        condition = Validator.containWrongSymbols(checkString);
        AssertJUnit.assertFalse(condition);
    }

    @Test
    public void notEnoughDataTrue() {
        checkString = "2.0 1.0 5.0 3.0 1.0 2.0 150";
        condition = Validator.notEnoughData(checkString);
        AssertJUnit.assertTrue(condition);
    }

    @Test
    public void notEnoughDataFalse() {
        checkString = "2.0 1.0 2.0 3.0 1.0 2.0 5.0 150.5";
        condition = Validator.notEnoughData(checkString);
        AssertJUnit.assertFalse(condition);
    }

    @Test
    public void isAdequateDiapasonTrue() {
        Cone cone = ShapeFactory.createCone(200, ShapeFactory.createPoint(100, 200, 300), ShapeFactory.createPoint(100, 200, 500), 500);
        condition = Validator.isAdequateDiapason(cone);
        AssertJUnit.assertTrue(condition);

    }

    @Test
    public void isAdequateDiapasonFalse() {
        Cone cone = new Cone(2000, new Point(1000, 2000, 3000), new Point(1000, 2000, 5000), 6000);
        condition = Validator.isAdequateDiapason(cone);
        AssertJUnit.assertFalse(condition);
    }
}
