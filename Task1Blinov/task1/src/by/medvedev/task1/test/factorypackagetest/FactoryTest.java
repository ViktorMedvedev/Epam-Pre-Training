package by.medvedev.task1.test.factorypackagetest;

import by.medvedev.task1.entity.Cone;
import by.medvedev.task1.entity.Point;
import by.medvedev.task1.factory.ShapeFactory;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class FactoryTest {
    private double radius = 2;
    private Point baseCenterPoint = new Point(1, 3, 5);
    private Point topPoint = new Point(1, 3, 10);
    private Cone actual = ShapeFactory.createCone(radius, baseCenterPoint, topPoint);

    @Test
    public void createConeTestTrue() {
        Cone expected = new Cone(radius, baseCenterPoint, topPoint);
        AssertJUnit.assertEquals(actual, expected);

    }

    @Test
    public void createPointTestTrue() {
        double x = 1;
        double y = 2;
        double z = 3;
        Point expected = ShapeFactory.createPoint(x, y, z);
        Point actual = new Point(x, y, z);
        AssertJUnit.assertEquals(actual, expected);
    }
}
