package by.epam.preTraining.task9.model.entities;

import java.util.ArrayList;
import java.util.List;

public class Sentence extends TextEntity {
    private List<SentenceParts> sentenceParts;

    public Sentence() {
        sentenceParts = new ArrayList<>();
    }

    public Sentence(String string) {
        this.string = string;
        sentenceParts = new ArrayList<>();
    }

    public void addWord(Word word) {
        sentenceParts.add(word);
    }


    public void setString(String string) {
        this.string = string;
    }

    public void addPunctuation(Punctuation mark) {
        sentenceParts.add(mark);
    }

    @Override
    public String buildString() {
        StringBuilder s = new StringBuilder();
        int length = sentenceParts.size();
        for (int i = 0; i < length; i++) {
            s.append(sentenceParts.get(i).buildString());
            if ((i == length - 1 || sentenceParts.get(i + 1) instanceof Word)) {
                s.append(" ");
            }
        }
        return s.toString();
    }

    public List<SentenceParts> getSentenceParts() {
        return sentenceParts;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Sentence other = (Sentence) obj;
        return this.sentenceParts.equals(other.sentenceParts);
    }

    @Override
    public int hashCode() {
        int hash = 1;
        for (SentenceParts sp : sentenceParts) {
            hash += hash * 31 + sp.hashCode();
        }
        return hash;
    }
}
