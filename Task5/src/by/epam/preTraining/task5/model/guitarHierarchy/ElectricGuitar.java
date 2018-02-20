package by.epam.preTraining.task5.model.guitarHierarchy;

import by.epam.preTraining.task5.model.exceptions.LogicExeption;

public class ElectricGuitar extends Guitar {

    private String pickUpConfiguration;
    private int numberOfStrings;

    public ElectricGuitar() {
        super.setName("unknown");
    }

    public ElectricGuitar(String name, String pickUpConfiguration, String color, int numberOfStrings, int cost) {
        super(name, color, cost);
        this.pickUpConfiguration = pickUpConfiguration;
        this.numberOfStrings = numberOfStrings;

    }

    public ElectricGuitar(ElectricGuitar guitar) throws LogicExeption {
        super();
        this.pickUpConfiguration = guitar.getPickUpConfiguration();
        this.numberOfStrings = guitar.getNumberOfStrings();

    }

    public String getPickUpConfiguration() {
        return pickUpConfiguration;
    }

    public void setPickUpConfiguration(String pickUpConfiguration) {
        this.pickUpConfiguration = pickUpConfiguration;
    }

    public int getNumberOfStrings() throws LogicExeption {
        if (numberOfStrings >= 6) {
            return numberOfStrings;
        } else {
            throw new LogicExeption("Number of strings of electric guitar can not be less than 6");
        }
    }

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ElectricGuitar that = (ElectricGuitar) o;

        if (numberOfStrings != that.numberOfStrings) return false;
        return pickUpConfiguration != null ? pickUpConfiguration.equals(that.pickUpConfiguration) : that.pickUpConfiguration == null;
    }

    @Override
    public int hashCode() {
        int result = pickUpConfiguration != null ? pickUpConfiguration.hashCode() : 0;
        result = 31 * result + numberOfStrings;
        return result;
    }

    @Override
    public String toString() {
        return "ElectricGuitar{" +
                "name='" + super.getName() + '\'' +
                ", pickUpConfiguration='" + pickUpConfiguration + '\'' +
                ", color='" + super.getColor() + '\'' +
                ", numberOfStrings=" + numberOfStrings + '\'' +
                ", cost=" + super.getCost() +
                '}';
    }


}



