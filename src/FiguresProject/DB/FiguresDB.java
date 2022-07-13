package FiguresProject.DB;

import FiguresProject.FiguresClasses.Figure;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static FiguresProject.Controllers.ControllerMessage.*;

public class FiguresDB implements Serializable {
    private static List<Figure> geometricalFigures = new ArrayList<>();

    public static List<Figure> getGeometricalFigures() {
        return geometricalFigures;
    }

    public static void setGeometricalFigures(List<Figure> geometricalFigures) {
        FiguresDB.geometricalFigures = geometricalFigures;
    }

    public static void printListOfGeometricalFigures() {
        if (geometricalFigures.isEmpty()) {
            System.out.println(NO_ONE_FIGURE_IN_LIST);
        } else {
            int counter = 1;
            for (Figure f :
                    geometricalFigures) {
                System.out.println(counter++ + ") Figure:\n");
                f.getInfo();
            }
        }
    }

    public static void printLastFigureInList() {
        geometricalFigures.get(geometricalFigures.size() - 1).getInfo();
    }

    public static void addFigureToList(Figure figure) {
        geometricalFigures.add(figure);
    }

    public static void printFigure(Figure figure) {
        figure.getInfo();
    }
}

