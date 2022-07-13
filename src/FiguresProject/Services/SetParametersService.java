package FiguresProject.Services;

import FiguresProject.Controllers.ControllerMenu;
import FiguresProject.DB.FiguresDB;
import FiguresProject.FiguresClasses.Circle;
import FiguresProject.FiguresClasses.Figure;
import FiguresProject.FiguresClasses.Rectangle;
import FiguresProject.FiguresClasses.Triangle;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import static FiguresProject.Controllers.ControllerMessage.*;
import static FiguresProject.DB.FiguresDB.*;

public class SetParametersService {
    public static final Scanner SCANNER = new Scanner(System.in);
//    AddFiguresService addFiguresService = new AddFiguresService();
//    List<Figure> geometricalFigures = FiguresDB.getGeometricalFigures();

    public void figuresInitializer(String number) throws Exception {

        if (number.equals("1")) {
            Circle circle = new Circle();
            circle.initializeFiguresParameters();
            FiguresDB.addFigureToList(circle);
            FiguresDB.printFigure(circle);
        }
        if (number.equals("2")) {
            Triangle triangle = new Triangle();
            triangle.initializeFiguresParameters();
            FiguresDB.addFigureToList(triangle);
            FiguresDB.printFigure(triangle);
        }
        if (number.equals("3")) {
            Rectangle rectangle = new Rectangle();
            rectangle.initializeFiguresParameters();
            FiguresDB.addFigureToList(rectangle);
            FiguresDB.printFigure(rectangle);
        }
        initializeAnotherOneFigure(number);
    }

    public void userChangesValueOfLastFigureInList() throws Exception {
        emptyListCheck();
        printLastFigureInList();
        Figure figure = getGeometricalFigures().get(getGeometricalFigures().size() - 1);
        figure.initializeFiguresParameters();
        getGeometricalFigures().set(getGeometricalFigures().size() - 1, figure);
        printListOfGeometricalFigures();
        System.out.println(FIGURE_CHANGED);
    }

    public void userChangesValueOfSelectedFigureInList() throws Exception {
        emptyListCheck();
        printListOfGeometricalFigures();
        System.out.println(NUMBER_TO_CHANGE);
        String value = SCANNER.next().toLowerCase();
        if (validation(value)) {
            Figure figure = getGeometricalFigures().get(Integer.parseInt(value) - 1);
            figure.initializeFiguresParameters();
            getGeometricalFigures().set(Integer.parseInt(value) - 1, figure);
            printListOfGeometricalFigures();
            System.out.println(FIGURE_CHANGED);
        } else {
            System.out.println(NOT_CORRECT_CHOICE_MESSAGE);
            userChangesValueOfSelectedFigureInList();
        }
    }

    public static void emptyListCheck() throws Exception {
        if (getGeometricalFigures().isEmpty()) {
            System.out.println(NO_ONE_FIGURE_IN_LIST);
            ControllerMenu controllerMenu = new ControllerMenu();
            controllerMenu.editMenu();
        }
    }

    //если нажать В после появления сообщения, возвращается в меню инициализации, нужно поправить валидатор


    public static boolean validation(String parameter) throws Exception {
        if (parameter.matches("[0-9]+") && Double.parseDouble(parameter) > 0) {
        } else if (parameter.equals("b")) {
            ControllerMenu controllerMenu = new ControllerMenu();
            controllerMenu.initializeMenu();
        } else {
            return false;
        }
        return true;
    }

    public void initializeAnotherOneFigure(String param) throws Exception {
        System.out.println(ANOTHER_ONE_MESSAGE);
        String userChoice = SCANNER.next().toLowerCase();
        if (userChoice.equals("y")) {
            figuresInitializer(param);
        } else {
            ControllerMenu controllerMenu = new ControllerMenu();
            controllerMenu.initializeMenu();
        }
    }

    public void filterFiguresList() {
        Optional<Figure> figureOptional = getGeometricalFigures().stream().findFirst();
        System.out.println(figureOptional.get());
    }
}