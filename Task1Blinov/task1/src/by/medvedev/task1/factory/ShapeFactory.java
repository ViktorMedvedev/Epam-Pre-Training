package by.medvedev.task1.factory;

import by.medvedev.task1.entity.Cone;
import by.medvedev.task1.entity.Point;

public class ShapeFactory {
    public static Cone createCone(double radius, Point baseCenter, Point top, double cost) {
        return new Cone(radius, baseCenter, top, cost);
    }

    public static Cone createCone(double radius, Point baseCenter, Point top) {
        return new Cone(radius, baseCenter, top);
    }

    public static Point createPoint(double x, double y, double z) {
        return new Point(x, y, z);
    }
}
