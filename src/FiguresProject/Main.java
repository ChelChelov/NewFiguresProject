package FiguresProject;

import FiguresProject.Controllers.ControllerMenu;
import FiguresProject.FiguresClasses.Circle;
import FiguresProject.FiguresClasses.Figure;
import FiguresProject.FiguresClasses.Rectangle;
import FiguresProject.FiguresClasses.Triangle;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static FiguresProject.Controllers.ControllerMessage.NOT_CORRECT_CHOICE_MESSAGE;
import static FiguresProject.Controllers.ControllerMessage.RADIUS_OF_CIRCLE_OR_BACK;
import static FiguresProject.DB.FiguresDB.getGeometricalFigures;
import static FiguresProject.Services.SetParametersService.SCANNER;

public class Main {
    public static void main(String[] args) throws Exception {
        ControllerMenu controllerMenu = new ControllerMenu();
        controllerMenu.mainMenu();
    }
}
