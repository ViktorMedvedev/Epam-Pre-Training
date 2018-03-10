package by.epam.preTraining.task9.model;

import by.epam.preTraining.task9.model.entities.SourceText;
import by.epam.preTraining.task9.model.entities.Text;
import by.epam.preTraining.task9.model.utils.TextParser;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyFileReader {

    private String path;
    private SourceText sourceText;
    private Text text;

    public MyFileReader(String path) {
        this.path = path;
    }

    public void readText() throws FileNotFoundException {
        StringBuilder stringWithTextFromFile = new StringBuilder();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))){
            String textFromFile;

            while ((textFromFile = bufferedReader.readLine()) != null) {
                stringWithTextFromFile.append(textFromFile).append("\r\n");
            }

        } catch (IOException e) {
            e.getMessage();
        }
        setTexts(new String(stringWithTextFromFile));
    }


    public Text getText() {
        return text;
    }


    private void setTexts(String text) {
        this.sourceText = new SourceText(text, path);
        this.text = new Text(text);
    }


    public String getSourceText() {
        return sourceText.getSourceText();
    }


    public String rebuildText(Text text) {
        return text.buildString();
    }

    public Text parseText() {
        TextParser parser = new TextParser();
        parser.setSource(sourceText);
        parser.setText(text);
        parser.parse();
        return parser.getText();
    }
}
