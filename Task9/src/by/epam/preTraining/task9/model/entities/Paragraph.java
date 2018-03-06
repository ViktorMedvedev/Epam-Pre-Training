package by.epam.preTraining.task9.model.entities;

import java.util.ArrayList;
import java.util.List;

public class Paragraph extends TextEntity {
    ArrayList<Sentence> sentences;

    public Paragraph() {
        sentences = new ArrayList<>();
    }

    public Paragraph(String string) {
        sentences = new ArrayList<>();
        this.string = string;
    }

    public void addSentence(Sentence s) {
        sentences.add(s);
    }

    @Override
    public String buildString() {
        StringBuilder s = new StringBuilder();
        for (Sentence sent : sentences) {
            s.append(sent.buildString());
        }
        return s.toString();
    }

    public List<Sentence> getSentences() {
        return sentences;
    }
}