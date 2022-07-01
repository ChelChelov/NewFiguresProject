package FiguresProject.Services;

import FiguresProject.Controllers.ControllerMenu;
import FiguresProject.DB.FiguresDB;
import FiguresProject.FiguresClasses.Circle;
import FiguresProject.FiguresClasses.Figure;
import FiguresProject.FiguresClasses.Rectangle;
import FiguresProject.FiguresClasses.Triangle;

import java.util.List;
import java.util.Scanner;

import static FiguresProject.Controllers.ControllerMessage.*;

public class SetParametersService {
    public static final Scanner SCANNER = new Scanner(System.in);
    AddFiguresService addFiguresService = new AddFiguresService();
    List<Figure> geometricalFigures = FiguresDB.getGeometricalFigures();

    public void figuresInitializer(String number) {

        if (number.equals("1")) {
            Circle circle = new Circle();
            circle.initializeFiguresParameters();
            addFiguresService.addFigureToList(circle);
            addFiguresService.printFigure(circle);

//            System.out.println(RADIUS_OF_CIRCLE_OR_BACK);
//            String radius = SCANNER.next().toLowerCase();
//            if (validation(radius)) {
//                setParametersOfCircle(radius);
//        } else {
//            figuresInitializer(number);
//        }
       initializeAnotherOneFigure(number);
        }
        if (number.equals("2")) {
            Triangle triangle = new Triangle();
            triangle.initializeFiguresParameters();
            addFiguresService.addFigureToList(triangle);
            addFiguresService.printFigure(triangle);
//            System.out.println(TRIANGLE_LINES_OR_BACK);
//            String firstLine = SCANNER.next().toLowerCase();
//            String secondLine = SCANNER.next().toLowerCase();
//            String thirdLine = SCANNER.next().toLowerCase();
//            if (validation(firstLine) && validation(secondLine) && validation(thirdLine)) {
//                setParametersOfTriangle(firstLine, secondLine, thirdLine);
//        } else {
//            figuresInitializer(number);

            initializeAnotherOneFigure(number);
        }

        if (number.equals("3")) {
            Rectangle rectangle = new Rectangle();
            rectangle.initializeFiguresParameters();
            addFiguresService.addFigureToList(rectangle);
            addFiguresService.printFigure(rectangle);
//            System.out.println(WIDTH_HEIGHT_OF_RECTANGLE_OR_BACK);
//            String width = SCANNER.next().toLowerCase();
//            String height = SCANNER.next().toLowerCase();
//            if (validation(width) && validation(height)) {
//                setParametersOfRectangle(width, height);
//            } else {
//                figuresInitializer(number);
//            }
//        }
            initializeAnotherOneFigure(number);
        }
    }

//    public void setParametersOfCircle(String userChoice) {
//        Circle circle = new Circle(Double.parseDouble(userChoice));
//        addFiguresService.addFigureToList(circle);
//        addFiguresService.printFigure(circle);
//    }
//
//    public void setParametersOfTriangle(String firstLine, String secondLine, String thirdLine) {
//        Triangle triangle = new Triangle(Double.parseDouble(firstLine), Double.parseDouble(secondLine), Double.parseDouble(thirdLine));
//        addFiguresService.addFigureToList(triangle);
//        addFiguresService.printFigure(triangle);
//    }
//
//    public void setParametersOfRectangle(String width, String height) {
//        Rectangle rectangle = new Rectangle(Double.parseDouble(width), Double.parseDouble(height));
//        addFiguresService.addFigureToList(rectangle);
//        addFiguresService.printFigure(rectangle);
//    }

    public static boolean validation(String parameter) {
//        for (String s :
//                parameter) {
        if (parameter.matches("[0-9]+") && Double.parseDouble(parameter) > 0){
        } else {
            ControllerMenu controllerMenu = new ControllerMenu();
            controllerMenu.initializeMenu();
        }
        return true;
    }


    // проблема в работе валидатора
// добавить отдельную валидацию на 1-й параметр для выхода в меню назад
    public void initializeAnotherOneFigure(String param) {
        System.out.println(ANOTHER_ONE_MESSAGE);
        String userChoice = SCANNER.next().toLowerCase();
        if (userChoice.equals("y")) {
            figuresInitializer(param);
        } else {
            ControllerMenu controllerMenu = new ControllerMenu();
            controllerMenu.initializeMenu();
        }
    }
}


//circle.setRadius(Double.parseDouble(userChoice));
//triangle.setFirstLine(Double.parseDouble(firstLine));
//        triangle.setSecondLine(Double.parseDouble(secondLine));
//        triangle.setThirdLine(Double.parseDouble(thirdLine));