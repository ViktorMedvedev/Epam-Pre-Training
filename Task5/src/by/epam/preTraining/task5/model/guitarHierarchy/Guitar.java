package by.epam.preTraining.task5.model.guitarHierarchy;

import by.epam.preTraining.task5.model.exceptions.LogicExeption;

public abstract class Guitar {
    private String name;
    private String color;
    private int cost;

    Guitar() {
        this.name = "unknown";
    }

    Guitar(String name, String color, int cost) {
        this.name = name;
        this.color = color;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getCost() {
        return cost;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCost(int cost) throws LogicExeption {
        if (cost >= 0) {
            this.cost = cost;
        } else {
            throw new LogicExeption("Cost can not be negative");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Guitar guitar = (Guitar) o;

        if (cost != guitar.cost) return false;
        if (name != null ? !name.equals(guitar.name) : guitar.name != null) return false;
        return color != null ? color.equals(guitar.color) : guitar.color == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + cost;
        return result;
    }

    @Override
    public abstract String toString();

}
