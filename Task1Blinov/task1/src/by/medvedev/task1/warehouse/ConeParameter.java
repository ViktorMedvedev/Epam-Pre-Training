package by.medvedev.task1.warehouse;

import by.medvedev.task1.businesslogic.ConeCalculator;
import by.medvedev.task1.entity.Cone;
import by.medvedev.task1.observer.Observer;

public class ConeParameter implements Observer {
    private double surfaceArea;
    private double volume;

    @Override
    public void handleEvent(Cone cone) {
        surfaceArea = ConeCalculator.countConeSurfaceArea(cone);
        volume = ConeCalculator.countConeVolume(cone);
    }

    public double getSurfaceArea() {
        return surfaceArea;
    }

    public double getVolume() {
        return volume;
    }
}
