package by.medvedev.task1.test.businesslogictest;

import by.medvedev.task1.businesslogic.ConeCalculator;
import by.medvedev.task1.entity.Cone;
import by.medvedev.task1.entity.Point;
import by.medvedev.task1.factory.ShapeFactory;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class ConeCalculatorTest {
    private Point baseCenter;
    private Point top;
    private double radius;

    @Test
    public void isConeTrue() {
        baseCenter = ShapeFactory.createPoint(1, 2, 3);
        top = ShapeFactory.createPoint(1, 2, 5);
        radius = 2.0;
        Cone cone = ShapeFactory.createCone(radius, baseCenter, top);
        boolean condition = ConeCalculator.isCone(cone);
        AssertJUnit.assertTrue(condition);
    }

    @Test
    public void isConeFalse() {
        baseCenter = ShapeFactory.createPoint(1, 2, 3);
        top = ShapeFactory.createPoint(1, 2, 3);
        radius = 2.0;
        Cone cone = ShapeFactory.createCone(radius, baseCenter, top);
        boolean condition = ConeCalculator.isCone(cone);
        AssertJUnit.assertFalse(condition);
    }

    @Test
    public void isConeParallelToPlaneTrue() {
        baseCenter = ShapeFactory.createPoint(1, 2, 3);
        top = ShapeFactory.createPoint(1, 2, 5);
        radius = 2.0;
        Cone cone = ShapeFactory.createCone(radius, baseCenter, top);
        boolean condition = ConeCalculator.isConeParallelToPlane(cone);
        AssertJUnit.assertTrue(condition);
    }

    @Test
    public void isConeParallelToPlaneFalse() {
        baseCenter = ShapeFactory.createPoint(1, 2, 3);
        top = ShapeFactory.createPoint(1, 3, 4);
        radius = 2.0;
        Cone cone = ShapeFactory.createCone(radius, baseCenter, top);
        boolean condition = ConeCalculator.isConeParallelToPlane(cone);
        AssertJUnit.assertFalse(condition);
    }

    @Test
    public void isConeBaseOnPlaneTrue() {
        baseCenter = ShapeFactory.createPoint(0, 2, 3);
        top = ShapeFactory.createPoint(0, 2, 5);
        radius = 2.0;
        Cone cone = ShapeFactory.createCone(radius, baseCenter, top);
        boolean condition = ConeCalculator.isConeBaseOnPlane(cone);
        AssertJUnit.assertTrue(condition);
    }

    @Test
    public void isConeBaseOnPlaneFalse() {
        baseCenter = ShapeFactory.createPoint(1, 2, 3);
        top = ShapeFactory.createPoint(1, 3, 4);
        radius = 2.0;
        Cone cone = ShapeFactory.createCone(radius, baseCenter, top);
        boolean condition = ConeCalculator.isConeParallelToPlane(cone);
        AssertJUnit.assertFalse(condition);
    }

    @Test
    public void isConeCrossedByCoordinatePlaneTrue() {
        baseCenter = ShapeFactory.createPoint(1, 2, -3);
        top = ShapeFactory.createPoint(1, 2, 5);
        radius = 2.0;
        Cone cone = ShapeFactory.createCone(radius, baseCenter, top);
        boolean condition = ConeCalculator.isConeCrossedByParallelCoordinatePlane(cone);
        AssertJUnit.assertTrue(condition);
    }

    @Test
    public void isConeCrossedByCoordinatePlaneFalse() {
        baseCenter = ShapeFactory.createPoint(1, 2, 3);
        top = ShapeFactory.createPoint(1, 3, 4);
        radius = 2.0;
        Cone cone = ShapeFactory.createCone(radius, baseCenter, top);
        boolean condition = ConeCalculator.isConeCrossedByParallelCoordinatePlane(cone);
        AssertJUnit.assertFalse(condition);
    }

    @Test
    public void countHeightOfConeDirectionX() {
        baseCenter = ShapeFactory.createPoint(6, 2, 5);
        top = ShapeFactory.createPoint(1, 2, 5);
        radius = 2.0;
        Cone cone = ShapeFactory.createCone(radius, baseCenter, top);
        double expected = 5;
        double actual = ConeCalculator.countHeightOfCone(cone);
        AssertJUnit.assertEquals(expected, actual, 0.000001);
    }

    @Test
    public void countHeightOfConeDirectionY() {
        baseCenter = ShapeFactory.createPoint(6, 2, 5);
        top = ShapeFactory.createPoint(6, 7, 5);
        radius = 2.0;
        Cone cone = ShapeFactory.createCone(radius, baseCenter, top);
        double expected = 5;
        double actual = ConeCalculator.countHeightOfCone(cone);
        AssertJUnit.assertEquals(expected, actual, 0.000001);
    }

    @Test
    public void countHeightOfConeDirectionZ() {
        baseCenter = ShapeFactory.createPoint(1, 2, -3);
        top = ShapeFactory.createPoint(1, 2, 5);
        radius = 2.0;
        Cone cone = ShapeFactory.createCone(radius, baseCenter, top);
        double expected = 8;
        double actual = ConeCalculator.countHeightOfCone(cone);
        AssertJUnit.assertEquals(expected, actual, 0.000001);
    }

    @Test
    public void countHeightOfConeIndefiniteDirection() {
        baseCenter = ShapeFactory.createPoint(1, 2, 3);
        top = ShapeFactory.createPoint(4, 5, 6);
        radius = 2.0;
        Cone cone = ShapeFactory.createCone(radius, baseCenter, top);
        double expected = 0;
        double actual = ConeCalculator.countHeightOfCone(cone);
        AssertJUnit.assertEquals(expected, actual, 0.000001);
    }

    @Test
    public void countConeFormingLineTrue() {
        baseCenter = ShapeFactory.createPoint(1, 2, -3);
        top = ShapeFactory.createPoint(1, 2, 1);
        radius = 3.0;
        Cone cone = ShapeFactory.createCone(radius, baseCenter, top);
        double expected = 5;
        double actual = ConeCalculator.countConeFormingLine(cone);
        AssertJUnit.assertEquals(expected, actual, 0.000001);
    }

    @Test
    public void countConeFormingLineFalse() {
        baseCenter = ShapeFactory.createPoint(1, 2, 3);
        top = ShapeFactory.createPoint(1, 2, 3);
        radius = 2.0;
        Cone cone = ShapeFactory.createCone(radius, baseCenter, top);
        double expected = 0;
        double actual = ConeCalculator.countConeFormingLine(cone);
        AssertJUnit.assertEquals(expected, actual, 0.000001);
    }

    @Test
    public void countConeSurfaceAreaTrue() {
        baseCenter = ShapeFactory.createPoint(1, 2, -3);
        top = ShapeFactory.createPoint(1, 2, 1);
        radius = 3.0;
        Cone cone = ShapeFactory.createCone(radius, baseCenter, top);
        double expected = Math.PI * 24;
        double actual = ConeCalculator.countConeSurfaceArea(cone);
        AssertJUnit.assertEquals(expected, actual, 0.000001);
    }

    @Test
    public void countConeSurfaceAreaFalse() {
        baseCenter = ShapeFactory.createPoint(1, 2, 3);
        top = ShapeFactory.createPoint(4, 5, 6);
        radius = 2.0;
        Cone cone = ShapeFactory.createCone(radius, baseCenter, top);
        double expected = 0;
        double actual = ConeCalculator.countConeSurfaceArea(cone);
        AssertJUnit.assertEquals(expected, actual, 0.000001);
    }

    @Test
    public void countConeVolumeTrue() {
        baseCenter = ShapeFactory.createPoint(1, 2, 0);
        top = ShapeFactory.createPoint(1, 2, 6);
        radius = 2.0;
        Cone cone = ShapeFactory.createCone(radius, baseCenter, top);
        double expected = Math.PI * 8;
        double actual = ConeCalculator.countConeVolume(cone);
        AssertJUnit.assertEquals(expected, actual, 0.000001);
    }

    @Test
    public void countConeVolumeFalse() {
        baseCenter = ShapeFactory.createPoint(1, 2, 3);
        top = ShapeFactory.createPoint(4, 5, 6);
        radius = 2.0;
        Cone cone = ShapeFactory.createCone(radius, baseCenter, top);
        double expected = 0;
        double actual = ConeCalculator.countConeVolume(cone);
        AssertJUnit.assertEquals(expected, actual, 0.000001);
    }

    @Test
    public void countRatioFromDissectionByParallelPlaneXTest() {
        baseCenter = ShapeFactory.createPoint(-3, 2, 3);
        top = ShapeFactory.createPoint(3, 2, 3);
        radius = 2.0;
        Cone cone = ShapeFactory.createCone(radius, baseCenter, top);
        double expected = 0.125;
        double actual = ConeCalculator.countRatioFromDissectionByParallelPlane(cone);
        AssertJUnit.assertEquals(expected, actual, 0.000001);
    }

    @Test
    public void countRatioFromDissectionByParallelPlaneYTest() {
        baseCenter = ShapeFactory.createPoint(3, -3, 3);
        top = ShapeFactory.createPoint(3, 3, 3);
        radius = 2.0;
        Cone cone = ShapeFactory.createCone(radius, baseCenter, top);
        double expected = 0.125;
        double actual = ConeCalculator.countRatioFromDissectionByParallelPlane(cone);
        AssertJUnit.assertEquals(expected, actual, 0.000001);
    }

    @Test
    public void countRatioFromDissectionByParallelPlaneZTest() {
        baseCenter = ShapeFactory.createPoint(3, 2, -3);
        top = ShapeFactory.createPoint(3, 2, 3);
        radius = 2.0;
        Cone cone = ShapeFactory.createCone(radius, baseCenter, top);
        double expected = 0.125;
        double actual = ConeCalculator.countRatioFromDissectionByParallelPlane(cone);
        AssertJUnit.assertEquals(expected, actual, 0.000001);
    }

    @Test
    public void countRatioFromDissectionByParallelPlaneZTestFalse() {
        baseCenter = ShapeFactory.createPoint(1, 2, 3);
        top = ShapeFactory.createPoint(1, 3, 4);
        radius = 2.0;
        Cone cone = ShapeFactory.createCone(radius, baseCenter, top);
        double expected = 0;
        double actual = ConeCalculator.countRatioFromDissectionByParallelPlane(cone);
        AssertJUnit.assertEquals(expected, actual, 0.000001);
    }

}
