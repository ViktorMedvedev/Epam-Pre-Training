package by.epam.preTraining.task9.model.entities;
import java.util.ArrayList;
import java.util.List;

public class Word extends SentenceParts {
    private List<Letter> letters;

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
        for (Letter letter : letters) {
            s.append(letter);
        }
        return s.toString();
    }

    public List<Letter> getLetters() {
        return letters;
    }

    public void setLetters(List<Letter> letters) {
        this.letters = letters;
    }
}