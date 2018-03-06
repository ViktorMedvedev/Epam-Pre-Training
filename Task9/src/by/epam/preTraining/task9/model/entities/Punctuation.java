package by.epam.preTraining.task9.model.entities;

public class Punctuation extends Symbol {

    public Punctuation() {
    }

    public Punctuation(String string) {
        this.string = string;
    }

    public void setMark(String string) {
        this.string = string;
    }

    public String getMark() {
        return string;
    }

}

