package FiguresProject.Repository;

import FiguresProject.DB.FiguresDB;
import FiguresProject.FiguresClasses.Figure;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static FiguresProject.Controllers.ControllerMessage.*;
import static FiguresProject.DB.FiguresDB.getGeometricalFigures;
import static FiguresProject.DB.FiguresDB.printListOfGeometricalFigures;
import static FiguresProject.Services.SetParametersService.emptyListCheck;

public class SaveLoadFigure {
    private String filename = "figures.txt";
    private List<Figure> geometricalFigures = getGeometricalFigures();

    public void saveAsDefaultFile() throws Exception {
        emptyListCheck();
        try {
            FileOutputStream fos = new FileOutputStream(filename);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(geometricalFigures);
            oos.close();
        } catch (FileNotFoundException e) {
            System.out.println(FILE_NOT_FOUND);
        } catch (IOException e) {
            System.out.println(ERROR_INITIALIZING_STREAM);
        }
        System.out.println(FILE_WRITTEN);
    }

    public void loadAsDefaultFile() {
        try {
            FileInputStream fis = new FileInputStream(filename);
            ObjectInputStream ois = new ObjectInputStream(fis);
            geometricalFigures = (ArrayList<Figure>) ois.readObject();
            ois.close();
        } catch (FileNotFoundException e) {
            System.out.println(FILE_NOT_FOUND);
        } catch (IOException e) {
            System.out.println(ERROR_INITIALIZING_STREAM);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        FiguresDB.setGeometricalFigures(geometricalFigures);
        printListOfGeometricalFigures();
    }
}

