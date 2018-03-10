package by.epam.preTraining.task9.model.utils;


import by.epam.preTraining.task9.model.entities.SourceText;
import by.epam.preTraining.task9.model.entities.Text;

public class TextParser implements Parsable {
    private Text text;
    private SourceText sourceText;

    @Override
    public void parse() {
        text = new Text(sourceText.getSourceText());
        ParagraphParser parser = new ParagraphParser();
        parser.setText(text);
        parser.parse();
    }

    public void setSource(SourceText source) {
        this.sourceText = source;
    }

    public void setText(Text text) {
        this.text = text;
    }

    public Text getText() {
        return text;
    }
}