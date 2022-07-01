package FiguresProject.Services;

import FiguresProject.DB.FiguresDB;
import FiguresProject.FiguresClasses.Figure;

import java.util.List;

public class AddFiguresService {
    List<Figure> geometricalFigures = FiguresDB.getGeometricalFigures();


    public void addFigureToList(Figure figure){
        geometricalFigures.add(figure);
    }

    public void printFigure(Figure figure){
     figure.getInfo();
    }
}
