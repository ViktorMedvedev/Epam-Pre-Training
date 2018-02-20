package by.epam.preTraining.task5.model.guitarHierarchy;

import by.epam.preTraining.task5.model.exceptions.LogicExeption;

public class AcousticGuitar extends Guitar {
    private String type;
    private String size;

    public AcousticGuitar() {
        super.setName("unknown");
    }

    public AcousticGuitar(String name, String type, String color, String size, int cost) {
        super(name, color, cost);
        this.type = type;
        this.size = size;
    }

    public AcousticGuitar(AcousticGuitar guitar) throws LogicExeption {
        super.setName(guitar.getName());
        super.setColor(guitar.getColor());
        super.setCost(guitar.getCost());
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
