package by.epam.preTraining.task9.model.utils;

import by.epam.preTraining.task9.model.entities.Punctuation;
import by.epam.preTraining.task9.model.entities.Sentence;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SentencePartsParser implements Parsable {
    private Sentence sentence;
    private String string;
    private final static String WORD_REGEXP = "[a-zA-Z0-9\\s][a-zA-Z_0-9\\s-]*";
    private final static String REGEXP = "[\\w-']+|[^\\w\\s]+";

    public SentencePartsParser() {
    }

    public void setString(String s) {
        this.string = s.trim();
    }


    @Override
    public void parse() {
        sentence = new Sentence();
        ArrayList<String> parts = new ArrayList<>();
        Matcher m = Pattern.compile(REGEXP).matcher(string);
        while (m.find()) {
            parts.add(m.group());
        }

        WordParser wordParser = new WordParser();
        int length = parts.size();

        for (int i = 0; i < length; i++) {
            if (parts.get(i).matches(WORD_REGEXP)) {
                wordParser.setString(parts.get(i));
                wordParser.parse();
                sentence.addWord(wordParser.getWord());
            } else {
                sentence.addPunctuation(new Punctuation(parts.get(i)));
            }
        }
    }

    public void setSentence(Sentence sentence) {
        this.sentence = sentence;
    }

    public Sentence getSentence() {
        return sentence;
    }
}

