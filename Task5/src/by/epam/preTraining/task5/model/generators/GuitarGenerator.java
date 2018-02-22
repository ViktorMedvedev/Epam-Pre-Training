package by.epam.preTraining.task5.model.generators;

import by.epam.preTraining.task5.model.exceptions.LogicExeption;
import by.epam.preTraining.task5.model.guitarHierarchy.AcousticGuitar;
import by.epam.preTraining.task5.model.guitarHierarchy.ElectricGuitar;
import by.epam.preTraining.task5.model.guitarHierarchy.Guitar;

import java.util.Random;

public class GuitarGenerator {
    private static final int TYPES_OF_GUITAR = 2;
    public static final int MAX_COST = 1200;
    public static final int MIN_COST = 200;
    private static String[] brands = {"Fender", "Gibson", "Yamaha", "Epiphone"};
    private static String[] typesOfAcoustic = {"dreadnought", "classic", "western", "jumbo"};
    private static String[] sizesOfAcoustic = {"4/4", "3/4", "2/4"};
    private static String[] configOfElectric = {"HH", "HSS", "SS", "SSS"};
    private static String[] color = {"Black", "Cherry-red", "Arctic-white", "Sunburst"};
    private static int[] stringsOfElectric = {6, 7, 8};

    public static Guitar generateGuitar() throws LogicExeption {
        Random random = new Random();
        int typeOfGuitar = random.nextInt(TYPES_OF_GUITAR);
        if (typeOfGuitar == 1) {
            return generateElectricGuitar();
        }
        return generateAcousticGuitar();
    }

    public static ElectricGuitar generateElectricGuitar() throws LogicExeption {
        Random random = new Random();
        ElectricGuitar electricGuitar = new ElectricGuitar();
        electricGuitar.setName(brands[random.nextInt(brands.length)]);
        electricGuitar.setPickUpConfiguration(configOfElectric[random.nextInt(configOfElectric.length)]);
        electricGuitar.setColor(color[random.nextInt(color.length)]);
        electricGuitar.setNumberOfStrings(stringsOfElectric[random.nextInt(stringsOfElectric.length)]);
        electricGuitar.setCost(random.nextInt(MAX_COST - MIN_COST + 1) + MIN_COST);
        return electricGuitar;
    }

    public static AcousticGuitar generateAcousticGuitar() throws LogicExeption {
        Random random = new Random();
        AcousticGuitar acousticGuitar = new AcousticGuitar();
        acousticGuitar.setName(brands[random.nextInt(brands.length)]);
        acousticGuitar.setType(typesOfAcoustic[random.nextInt(typesOfAcoustic.length)]);
        acousticGuitar.setColor(color[random.nextInt(color.length)]);
        acousticGuitar.setSize(sizesOfAcoustic[random.nextInt(sizesOfAcoustic.length)]);
        acousticGuitar.setCost(random.nextInt(MAX_COST - MIN_COST + 1) + MIN_COST);
        return acousticGuitar;
    }
}
