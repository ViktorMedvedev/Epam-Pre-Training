package by.epam.preTraining.task9.model.entities;

public class Letter extends Symbol {

    public Letter() {
    }

    public Letter(String string) {
        this.string = string;
    }

    public void setLetter(String string) {
        this.string = string;
    }

    public String getLetter() {
        return string;
    }
}