package by.medvedev.task1.businesslogic;

import by.medvedev.task1.entity.Cone;
import by.medvedev.task1.entity.Point;
import by.medvedev.task1.factory.ShapeFactory;
import by.medvedev.task1.validator.Validator;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ConeCalculator {
    private static double baseCenterX;
    private static double baseCenterY;
    private static double baseCenterZ;
    private static double topX;
    private static double topY;
    private static double topZ;
    private static double radius;
    private static double height;
    private static double coneFormingLine;
    private static Logger logger = LogManager.getLogger();

    public static boolean isCone(Cone cone) {
        return !cone.getBaseCenter().equals(cone.getTop()) && cone.getRadius() > 0;
    }

    public static boolean isConeParallelToPlane(Cone cone) {
        baseCenterX = cone.getBaseCenter().getX();
        baseCenterY = cone.getBaseCenter().getY();
        baseCenterZ = cone.getBaseCenter().getZ();
        topX = cone.getTop().getX();
        topY = cone.getTop().getY();
        topZ = cone.getTop().getZ();
        return (topX == baseCenterX
                && topY == baseCenterY)
                || (topX == baseCenterX
                && topZ == baseCenterZ)
                || (topZ == baseCenterZ
                && topY == baseCenterY);
    }


    public static boolean isConeBaseOnPlane(Cone cone) {
        if (isConeSuitableForCalculation(cone)) {
            baseCenterX = cone.getBaseCenter().getX();
            baseCenterY = cone.getBaseCenter().getY();
            baseCenterZ = cone.getBaseCenter().getZ();
            return baseCenterX == 0
                    || baseCenterY == 0
                    || baseCenterZ == 0;

        } else {
            return false;
        }
    }

    public static boolean isConeCrossedByParallelCoordinatePlane(Cone cone) {
        if (isConeSuitableForCalculation(cone)) {
            baseCenterX = cone.getBaseCenter().getX();
            baseCenterY = cone.getBaseCenter().getY();
            baseCenterZ = cone.getBaseCenter().getZ();
            topX = cone.getTop().getX();
            topY = cone.getTop().getY();
            topZ = cone.getTop().getZ();
            return (baseCenterX < 0 && topX > 0
                    || baseCenterX > 0 && topX < 0
                    || baseCenterY < 0 && topY > 0
                    || baseCenterY > 0 && topY < 0
                    || baseCenterZ < 0 && topZ > 0
                    || baseCenterZ > 0 && topZ < 0)
                    || (radius > Math.abs(baseCenterX)
                    || radius > Math.abs(baseCenterY)
                    || radius > Math.abs(baseCenterZ));
        } else {
            return false;
        }
    }

    public static boolean isConeSuitableForCalculation(Cone cone) {
        if (isCone(cone) && isConeParallelToPlane(cone) && Validator.isAdequateDiapason(cone)) {
            return true;
        } else {
            logger.log(Level.ERROR, "Cone is not suitable for count");
            return false;
        }
    }

    public static double countHeightOfCone(Cone cone) {
        if (isConeSuitableForCalculation(cone)) {
            baseCenterX = cone.getBaseCenter().getX();
            baseCenterY = cone.getBaseCenter().getY();
            baseCenterZ = cone.getBaseCenter().getZ();
            topX = cone.getTop().getX();
            topY = cone.getTop().getY();
            topZ = cone.getTop().getZ();
            if (topX == baseCenterX && topY == baseCenterY) {
                height = Math.abs(topZ - baseCenterZ);
            }
            if (topX == baseCenterX && topZ == baseCenterZ) {
                height = Math.abs(topY - baseCenterY);
            }
            if (topY == baseCenterY && topZ == baseCenterZ) {
                height = Math.abs(topX - baseCenterX);
            }
            return height;
        } else {
            return 0;
        }

    }

    public static double countConeFormingLine(Cone cone) {
        radius = cone.getRadius();
        height = countHeightOfCone(cone);
        if (height != 0 && radius != 0) {
            return Math.hypot(radius, height);
        } else {
            return 0;
        }

    }

    public static double countConeSurfaceArea(Cone cone) {
        if (countConeFormingLine(cone) > 0) {
            radius = cone.getRadius();
            coneFormingLine = countConeFormingLine(cone);
            return Math.PI * radius * (radius + coneFormingLine);
        } else return 0;
    }

    public static double countConeVolume(Cone cone) {
        radius = cone.getRadius();
        height = countHeightOfCone(cone);
        return (1 / 3.0) * height * Math.PI * Math.pow(radius, 2);
    }

    public static double countRatioFromDissectionByParallelPlane(Cone cone) {
        double ratio = 0;
        if (isConeCrossedByParallelCoordinatePlane(cone)) {
            radius = cone.getRadius();
            baseCenterX = cone.getBaseCenter().getX();
            baseCenterY = cone.getBaseCenter().getY();
            baseCenterZ = cone.getBaseCenter().getZ();
            topX = cone.getTop().getX();
            topY = cone.getTop().getY();
            topZ = cone.getTop().getZ();
            Point top = cone.getTop();
            Point baseCenter1;
            Cone cone1 = null;
            double radius1;
            double height1;
            double coneVolume;
            double cone1Volume;
            height = countHeightOfCone(cone);
            if (baseCenterX < 0 && topX > 0 || baseCenterX > 0 && topX < 0) {
                height1 = Math.abs(topX);
                radius1 = radius * (height1 / height);
                baseCenter1 = ShapeFactory.createPoint(0, baseCenterY, baseCenterZ);
                cone1 = ShapeFactory.createCone(radius1, baseCenter1, top);
            }
            if (baseCenterY < 0 && topY > 0 || baseCenterY > 0 && topY < 0) {
                height1 = Math.abs(topY);
                radius1 = radius * (height1 / height);
                baseCenter1 = ShapeFactory.createPoint(baseCenterX, 0, baseCenterZ);
                cone1 = ShapeFactory.createCone(radius1, baseCenter1, top);
            }
            if (baseCenterZ < 0 && topZ > 0 || baseCenterZ > 0 && topZ < 0) {
                height1 = Math.abs(topZ);
                radius1 = radius * (height1 / height);
                baseCenter1 = ShapeFactory.createPoint(baseCenterX, baseCenterY, 0);
                cone1 = ShapeFactory.createCone(radius1, baseCenter1, top);
            }
            coneVolume = countConeVolume(cone);
            cone1Volume = countConeVolume(cone1);
            ratio = cone1Volume / coneVolume;
        } else {
            logger.log(Level.ERROR, "Cone is not crossed by parallel plane");
        }
        return ratio;
    }

}
