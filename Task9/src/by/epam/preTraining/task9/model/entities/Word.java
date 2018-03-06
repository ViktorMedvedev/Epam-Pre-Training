package by.epam.preTraining.task9.model.entities;
import java.util.ArrayList;
import java.util.List;

public class Word extends TextEntity {
    ArrayList<Letter> letters;

    public Word() {
        letters = new ArrayList<>();
    }

    public Word(String string) {
        this.string = string;
        letters = new ArrayList<>();
    }

    public void addLetter(Letter c) {
        letters.add(c);
    }

    @Override
    public String buildString() {
        StringBuilder s = new StringBuilder();
        for (Letter l : letters) {
            s.append(l);
        }
        return s.toString();
    }

    public List<Letter> getLetters() {
        return letters;
    }
}