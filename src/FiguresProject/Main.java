package FiguresProject;

import FiguresProject.Controllers.ControllerMenu;
import FiguresProject.FiguresClasses.Circle;
import FiguresProject.Services.AddFiguresService;

import static FiguresProject.Controllers.ControllerMessage.NOT_CORRECT_CHOICE_MESSAGE;
import static FiguresProject.Controllers.ControllerMessage.RADIUS_OF_CIRCLE_OR_BACK;
import static FiguresProject.Services.SetParametersService.SCANNER;

public class Main {
    public static void main(String[] args) {

        ControllerMenu controllerMenu = new ControllerMenu();
        controllerMenu.mainMenu();
//        AddFiguresService addFiguresService = new AddFiguresService();
//        System.out.println(RADIUS_OF_CIRCLE_OR_BACK);
//        String userChoice = SCANNER.next().toLowerCase();
////        Main.validationFiguresInitialization(userChoice);
//        if (userChoice.equals("b")) {
//            controllerMenu.initializeMenu();
//        } else if (userChoice.matches("[0-9]+") && Double.parseDouble(userChoice) > 0) {
//            Circle circle = new Circle();
//            circle.setRadius(Double.parseDouble(userChoice));
//            addFiguresService.addFigureToList(circle);
//            addFiguresService.printFigure(circle);
//        } else {
//            System.out.println(NOT_CORRECT_CHOICE_MESSAGE);
//            main(args);
//        }
    }
//
//    public static boolean validationFiguresInitialization(String userChoice) {
//        if (userChoice.equals("b")) {
//            controllerMenu.initializeMenu();
//            return true;
//        } else if (userChoice.matches("[0-9]+") && Double.parseDouble(userChoice) > 0){
//            return true;
//        } else {
//            return false;
//        }
//    }

}
