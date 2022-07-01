package FiguresProject.Controllers;

import FiguresProject.Services.SetParametersService;

import java.util.Locale;

import static FiguresProject.Controllers.ControllerMessage.*;
import static FiguresProject.Services.SetParametersService.SCANNER;

public class ControllerMenu {

    //    SettingFigureService service = new SettingFigureService();
//    FileService fileService = new FileService();
//    ChangingFiguresService changingFiguresService = new ChangingFiguresService();
//    StringBuilder welcomeMessage = new StringBuilder(WELCOME_MESSAGE);
//    SetParametersService setParametersService = new SetParametersService();
    SetParametersService setParametersService = new SetParametersService();

    public void mainMenu() {
//        System.out.println(welcomeMessage);
        System.out.println(MAIN_MENU_MESSAGE);
        ;
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

    public void initializeMenu() {
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

    public void editMenu() {
        System.out.println(EDIT_MENU_MESSAGE);
        String userChoice = SCANNER.next().toLowerCase(Locale.ROOT);
        switch (userChoice) {
//            case "1" -> changingFiguresService.userChangesValueOfLastFigureInList();
//            case "2" -> changingFiguresService.userChangesValueOfFigure();
            case "s" -> saveLoadMenu();
            case "c" -> initializeMenu();
            case "m" -> mainMenu();
            case "q" -> System.exit(0);
            default -> System.out.println(NOT_CORRECT_CHOICE_MESSAGE);
        }
        editMenu();
    }

    public void saveLoadMenu() {
        System.out.println(SAVE_LOAD_MENU_MESSAGE);
        String userChoice = SCANNER.next().toLowerCase(Locale.ROOT);
        switch (userChoice) {
//            case "1" -> fileService.loadAsDefaultFile();
//            case "2" -> fileService.loadUsersFile();
//            case "3" -> fileService.saveAsDefaultFile();
//            case "4" -> fileService.deleteSelectedUsersFigures();
//            case "5" -> fileService.saveUsersFile();
            case "c" -> initializeMenu();
            case "e" -> editMenu();
            case "m" -> mainMenu();
            case "q" -> System.exit(0);
            default -> System.out.println(NOT_CORRECT_CHOICE_MESSAGE);
        }
        saveLoadMenu();
    }
}