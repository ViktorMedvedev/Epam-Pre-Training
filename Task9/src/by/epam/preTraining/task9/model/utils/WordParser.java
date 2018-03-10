package by.epam.preTraining.task9.model.utils;

import by.epam.preTraining.task9.model.entities.Letter;
import by.epam.preTraining.task9.model.entities.Word;

public class WordParser implements Parsable {
    private String string;
    private Word word;

    public WordParser() {
    }

    @Override
    public void parse() {
        word = new Word();
        int length = string.length();
        for (int i = 0; i < length; i++) {
            word.addLetter(new Letter(string.substring(i, i + 1)));
        }
    }

    public Word getWord() {
        return word;
    }

    public void setString(String s) {
        this.string = s;
    }
}

