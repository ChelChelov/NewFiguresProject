package FiguresProject.Repository;

import FiguresProject.DB.FiguresDB;
import FiguresProject.FiguresClasses.Figure;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static FiguresProject.Controllers.ControllerMessage.FILE_WRITTEN;
import static FiguresProject.Controllers.ControllerMessage.NO_ONE_FIGURE_IN_LIST;
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
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error initializing stream");
        }
        System.out.println(FILE_WRITTEN);
    }

    public void loadAsDefaultFile() throws Exception {
        try {
            FileInputStream fis = new FileInputStream(filename);
            ObjectInputStream ois = new ObjectInputStream(fis);
            geometricalFigures = (ArrayList<Figure>) ois.readObject();
            ois.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error initializing stream");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        FiguresDB.setGeometricalFigures(geometricalFigures);
        printListOfGeometricalFigures();
    }
}

