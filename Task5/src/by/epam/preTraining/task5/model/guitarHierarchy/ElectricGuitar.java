package by.epam.preTraining.task5.model.guitarHierarchy;

import by.epam.preTraining.task5.model.exceptions.LogicExeption;
import by.epam.preTraining.task5.model.exceptions.WrongCostException;
import by.epam.preTraining.task5.model.exceptions.WrongNumberOfStringsException;

public class ElectricGuitar extends Guitar {

    private String pickUpConfiguration;
    private int numberOfStrings;

    public ElectricGuitar() {
        super.setName("unknown");
    }

    public ElectricGuitar(String name, String pickUpConfiguration, String color, int numberOfStrings, int cost) {
        this.name = name;
        this.color = color;
        this.cost = cost;
        this.pickUpConfiguration = pickUpConfiguration;
        this.numberOfStrings = numberOfStrings;

    }

    public ElectricGuitar(ElectricGuitar guitar) throws LogicExeption {
        this.name = guitar.getName();
        this.color = guitar.getColor();
        this.cost = guitar.getCost();
        this.pickUpConfiguration = guitar.getPickUpConfiguration();
        this.numberOfStrings = guitar.getNumberOfStrings();

    }

    public String getPickUpConfiguration() {
        return pickUpConfiguration;
    }

    public void setPickUpConfiguration(String pickUpConfiguration) {
        this.pickUpConfiguration = pickUpConfiguration;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public void setNumberOfStrings(int numberOfStrings) throws WrongCostException {
        if (numberOfStrings >= 6) {
            this.numberOfStrings = numberOfStrings;
        } else {
            throw new WrongCostException("Number of strings of electric guitar can not be less than 6");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        ElectricGuitar that = (ElectricGuitar) o;

        if (numberOfStrings != that.numberOfStrings) return false;
        return pickUpConfiguration != null ? pickUpConfiguration.equals(that.pickUpConfiguration) : that.pickUpConfiguration == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (pickUpConfiguration != null ? pickUpConfiguration.hashCode() : 0);
        result = 31 * result + numberOfStrings;
        return result;
    }

    @Override
    public String toString() {
        return "ElectricGuitar{" + super.toString() +
                "pickUpConfiguration='" + pickUpConfiguration + '\'' +
                ", numberOfStrings=" + numberOfStrings +
                '}';
    }

}




