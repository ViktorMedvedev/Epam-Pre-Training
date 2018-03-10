package by.epam.preTraining.task9.model.utils;

import by.epam.preTraining.task9.model.entities.Text;

public class ParagraphParser implements Parsable {
    private Text text;
    private final static String REGEXP = "(\\n)";

    @Override
    public void parse() {
        String s = text.toString();
        String[] split = s.split(REGEXP);
        SentenceParser parser = new SentenceParser();
        int length = split.length;

        for (int i = 0; i < length; i++) {
            parser.setString(split[i]);
            parser.parse();
            text.addParagraph(parser.getParagraph());
        }
    }

    public void setText(Text text) {
        this.text = text;
    }

    public Text getText() {
        return text;
    }
}

