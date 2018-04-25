package by.medvedev.task1.entity;

import by.medvedev.task1.factory.ShapeFactory;
import by.medvedev.task1.observer.Observed;
import by.medvedev.task1.observer.Observer;

import java.util.ArrayList;

public class Cone implements Observed {
    private ArrayList<Observer> observers = new ArrayList<>();
    private double radius;
    private Point baseCenter;
    private Point top;
    private double cost;

    public Cone(double radius, Point baseCenter, Point top, double cost) {
        this.radius = radius;
        this.baseCenter = baseCenter;
        this.top = top;
        this.cost = cost;
    }

    public Cone(double radius, Point baseCenter, Point top) {
        this.radius = radius;
        this.baseCenter = baseCenter;
        this.top = top;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Point getBaseCenter() {
        return baseCenter;
    }

    public void setBaseCenter(Point baseCenter) {
        this.baseCenter = baseCenter;
    }

    public Point getTop() {
        return top;
    }

    public void setTop(Point top) {
        this.top = top;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Cone cone = (Cone) o;
        return Double.compare(cone.radius, radius) == 0
                && Double.compare(cone.cost, cost) == 0
                && (baseCenter != null ? baseCenter.equals(cone.baseCenter) : cone.baseCenter == null)
                && (top != null ? top.equals(cone.top) : cone.top == null);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(radius);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + (baseCenter != null ? baseCenter.hashCode() : 0);
        result = 31 * result + (top != null ? top.hashCode() : 0);
        temp = Double.doubleToLongBits(cost);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Cone{" +
                "radius=" + radius +
                ", baseCenter=" + baseCenter +
                ", top=" + top +
                ", cost=" + cost +
                '}';
    }

    @Override
    public void attach(Observer ob) {
        observers.add(ob);
    }

    @Override
    public void detach(Observer ob) {
        observers.remove(ob);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.handleEvent(this);
        }
    }
}

