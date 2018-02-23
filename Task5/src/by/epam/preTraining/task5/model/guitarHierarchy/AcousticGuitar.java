package by.epam.preTraining.task5.model.guitarHierarchy;

import by.epam.preTraining.task5.model.exceptions.LogicExeption;

public class AcousticGuitar extends Guitar {

    private String type;
    private String size;

    public AcousticGuitar() {
        super.setName("unknown");
    }

    public AcousticGuitar(String name, String type, String color, String size, int cost) {
        this.name = name;
        this.color = color;
        this.cost = cost;
        this.type = type;
        this.size = size;
    }

    public AcousticGuitar(AcousticGuitar guitar) throws LogicExeption {
        this.name = guitar.getName();
        this.color = guitar.getColor();
        this.cost = guitar.getCost();
        this.type = guitar.getType();
        this.size = guitar.getSize();
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        AcousticGuitar that = (AcousticGuitar) o;

        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        return size != null ? size.equals(that.size) : that.size == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (size != null ? size.hashCode() : 0);
        return result;
    }


    @Override
    public String toString() {
        return "AcousticGuitar{" +
                "name='" + super.getName() + '\'' +
                ", type='" + type + '\'' +
                ", color='" + super.getColor() + '\'' +
                ", size=" + size +
                ", cost=" + super.getCost() +
                '}';
    }
}
