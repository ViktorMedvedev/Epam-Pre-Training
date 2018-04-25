package by.medvedev.task1.test.dataworktest;

import by.medvedev.task1.exception.FileIsEmptyException;
import by.medvedev.task1.exception.WrongPathException;
import by.medvedev.task1.entity.Cone;
import by.medvedev.task1.datawork.DigitDataWorker;
import by.medvedev.task1.factory.ShapeFactory;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class DigitDataWorkerTest {
    private DigitDataWorker worker = new DigitDataWorker();
    private String path;
    private String line;
    private List<String> list;
    private ArrayList<String> arrayList;
    private boolean condition;

    @Test
    public void readDataLinesTest() throws FileIsEmptyException, WrongPathException {
        path = "dataFiles//Points.txt";
        list = worker.readDataLines(path);
        condition = list.size() > 0;
        AssertJUnit.assertTrue(condition);
    }

    @Test(expectedExceptions = FileIsEmptyException.class)
    public void readDataLinesTestFileIsEmptyException() throws FileIsEmptyException, WrongPathException {
        path = "dataFiles//EmptyFile.txt";
        worker.readDataLines(path);
    }

    @Test(expectedExceptions = WrongPathException.class)
    public void readDataLinesTestWrongPathException() throws FileIsEmptyException, WrongPathException {
        path = "dataFiles//EmptyFile1.txt";
        worker.readDataLines(path);
    }

    @Test
    public void getCorrectDataTestTrue() {
        list = new ArrayList<String>();
        line = "2.0 1.0 2.0 3.0 1.0 2.0 5.0 150.5";
        list.add(line);
        arrayList = worker.getCorrectData(list);
        condition = arrayList.size() > 0;
        AssertJUnit.assertTrue(condition);
    }

    @Test
    public void getCorrectDataTestFalse() {
        List<String> list = new ArrayList<String>();
        String string = "2.0, 1.0 2.0, 1.0 2.0 5.0";
        list.add(string);
        arrayList = worker.getCorrectData(list);
        condition = arrayList.size() > 0;
        AssertJUnit.assertFalse(condition);
    }

    @Test
    public void parseStringIntoConeTrue() {
        line = "2.0 1.0 2.0 3.0 1.0 2.0 5.0 150.5";
        Cone coneActual = worker.parseStringIntoCone(line);
        Cone coneExpected = ShapeFactory.createCone(2.0, ShapeFactory.createPoint(1.0, 2.0, 3.0), ShapeFactory.createPoint(1.0, 2.0, 5.0), 150.5);
        AssertJUnit.assertEquals(coneExpected, coneActual);
    }
}
