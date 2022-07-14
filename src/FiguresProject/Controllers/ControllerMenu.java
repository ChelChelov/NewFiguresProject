package FiguresProject.Controllers;

import FiguresProject.Repository.SaveLoadFigure;
import FiguresProject.Services.SetParametersService;

import java.util.Locale;

import static FiguresProject.Controllers.ControllerMessage.*;
import static FiguresProject.Services.SetParametersService.SCANNER;

public class ControllerMenu {

//    StringBuilder welcomeMessage = new StringBuilder(WELCOME_MESSAGE);
    SetParametersService setParametersService = new SetParametersService();
    SaveLoadFigure saveLoadFigure = new SaveLoadFigure();

    public void mainMenu() throws Exception {
//        System.out.println(welcomeMessage);
        System.out.println(MAIN_MENU_MESSAGE);
        String userChoice = SCANNER.next().toLowerCase(Locale.ROOT);
        switch (userChoice) {
            case "1" -> initializeMenu();
            case "2" -> editMenu();
            case "3" -> saveLoadMenu();
            case "q" -> System.exit(0);
            default -> System.out.println(NOT_CORRECT_CHOICE_MESSAGE);
        }
        mainMenu();
    }

    public void initializeMenu() throws Exception {
        System.out.println(INITIALIZE_MENU_MESSAGE);
        String userChoice = SCANNER.next().toLowerCase(Locale.ROOT);
        switch (userChoice) {
            case "1", "2", "3" -> setParametersService.figuresInitializer(userChoice);
            case "e" -> editMenu();
            case "s" -> saveLoadMenu();
            case "m" -> mainMenu();
            case "q" -> System.exit(0);
            default -> System.out.println(NOT_CORRECT_CHOICE_MESSAGE);
        }
        initializeMenu();
    }

    public void editMenu() throws Exception {
        System.out.println(EDIT_MENU_MESSAGE);
        String userChoice = SCANNER.next().toLowerCase(Locale.ROOT);
        switch (userChoice) {
            case "1" -> setParametersService.userChangesValueOfLastFigureInList();
            case "2" -> setParametersService.userChangesValueOfSelectedFigureInList();
            case "s" -> saveLoadMenu();
            case "c" -> initializeMenu();
            case "m" -> mainMenu();
            case "q" -> System.exit(0);
            default -> System.out.println(NOT_CORRECT_CHOICE_MESSAGE);
        }
        editMenu();
    }

    public void saveLoadMenu() throws Exception {
        System.out.println(SAVE_LOAD_MENU_MESSAGE);
        String userChoice = SCANNER.next().toLowerCase(Locale.ROOT);
        switch (userChoice) {
            case "1" -> saveLoadFigure.loadAsDefaultFile();
            case "3" -> saveLoadFigure.saveAsDefaultFile();
            case "c" -> initializeMenu();
            case "e" -> editMenu();
            case "m" -> mainMenu();
            case "q" -> System.exit(0);
            default -> System.out.println(NOT_CORRECT_CHOICE_MESSAGE);
        }
        saveLoadMenu();
    }
}