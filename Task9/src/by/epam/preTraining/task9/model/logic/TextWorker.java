package by.epam.preTraining.task9.model.logic;

import by.epam.preTraining.task9.model.entities.*;

public class TextWorker {
    public static String swapWords(Text text) {
        for (Paragraph p : text.getParagraphs()) {
            for (Sentence s : p.getSentences()) {
                SentenceParts temp = s.getSentenceParts().get(findLastWordPosition(s));
                s.getSentenceParts().set(findLastWordPosition(s), s.getSentenceParts().get(0));
                s.getSentenceParts().set(0, temp);
            }
        }
        return text.buildString();
    }

    private static int findLastWordPosition(Sentence sent) {
        int lastPos = sent.getSentenceParts().size() - 2;
        for (int i = lastPos; i >= 0; i++) {
            if (sent.getSentenceParts().get(i) instanceof Word) {
                return i;
            }
        }
        return -1;
    }

    public static String removeFirstLetterFromWordEverywere(Text text) {

        for (Paragraph paragraph : text.getParagraphs()) {
            for (Sentence sentence : paragraph.getSentences()) {
                for (SentenceParts sentenceParts : sentence.getSentenceParts()) {
                    if (sentenceParts instanceof Word) {
                        Letter firstLetter = ((Word) sentenceParts).getLetters().get(0);
                        int top = ((Word) sentenceParts).getLetters().size() - 1;

                        for (int i = 1; i < top; i++) {
                            if (((Word) sentenceParts).getLetters().get(i).equals(firstLetter)) {
                                ((Word) sentenceParts).getLetters().remove(i);
                            }
                        }
                        ((Word) sentenceParts).getLetters().remove(firstLetter);
                    }
                }
            }
        }
        return text.buildString();
    }

}


