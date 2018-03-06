package by.epam.preTraining.task9.model.entities;

import java.util.ArrayList;

public class Sentence extends TextEntity {
    ArrayList<PartOfSentence> partsOfSentences;

    public Sentence(){
        partsOfSentences = new ArrayList<>();
    }
    public Sentence(String string) {
        this.string = string;
        partsOfSentences = new ArrayList<>();
    }

    public void addWord(Punctuation word) {
        partsOfSentences.add(word);
    }
    public void addPunctuation(Punctuation mark) {
        partsOfSentences.add(mark);
    }
    public void setString(String string) {
        this.string = string;
    }
    public ArrayList<PartOfSentence> getParts() {
        return partsOfSentences;
    }

    @Override
    public String buildString() {
        StringBuilder s = new StringBuilder();
        int length = partsOfSentences.size();
        for (int i = 0; i < length; i++) {
            s.append(partsOfSentences.get(i).buildString());
            if ((i == length - 1)) {
                s.append(" ");
            }
        }
        return s.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Sentence sentence = (Sentence) o;

        return partsOfSentences != null ? partsOfSentences.equals(sentence.partsOfSentences) : sentence.partsOfSentences == null;
    }

    @Override
    public int hashCode() {
        return partsOfSentences != null ? partsOfSentences.hashCode() : 0;
    }
}
