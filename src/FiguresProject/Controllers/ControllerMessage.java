package FiguresProject.Controllers;

public class ControllerMessage {
    public static final String WELCOME_MESSAGE = "Welcome to Figures Redactor 2.0!\n";
    public static final String NOT_CORRECT_CHOICE_MESSAGE = "\nYour choice is not correct, try again.\n";
    public static final String CHANGE_PARAMETERS_MESSAGE = "Do you want to change parameters of this figure?";
    public static final String ANOTHER_ONE_MESSAGE = "If you would like to initialize another one press \"Y\"\n" +
            "If you would like to go back - press any button.";
    public static final String FILE_NAME = "Please enter a file name.";
    public static final String FILE_WRITTEN = "File was successfully written\n";
    public static final String WRONG_PARAMETERS_MESSAGE =
            "You set wrong parameter, please set only positive numbers\n";
    public static final String FIGURE_ADDED = "Figure was successfully added to the list\n";
    public static final String FIGURE_CHANGED = "Figure was successfully changed\n";
    public static final String RADIUS_OF_CIRCLE_OR_BACK = "Set the radius to initialize the circle or press \"B\" to go back.\n" +
            "Please set only positive numbers.";
    public static final String TRIANGLE_LINES_OR_BACK = "Set three lines to initialize the triangle or press \"B\" to go back.\n" +
            "Please set only positive numbers.";
    public static final String WIDTH_HEIGHT_OF_RECTANGLE_OR_BACK = "Set width and height to initialize the rectangle or press \"B\" to go back.\n" +
            "Please set only positive numbers.";
    public static final String NO_ONE_FIGURE_IN_LIST = "There are no one geometrical figure in the list yet\n";
    public static final String NUMBER_TO_CHANGE = "Please enter a number of the figure you want to change or press \"B\" to go back.\n";
    public static final String MAIN_MENU_MESSAGE = """
            Please, type a number to select an option to:
            1) Calculate perimeter and area of geometrical figures in "Calculate Menu"
            2) Edit parameters of your figures in "Edit Menu"
            3) Save or load figures in "Save/Load Menu"
            Q) To quit program""";
    public static final String INITIALIZE_MENU_MESSAGE = """
            Please, type a number to select a geometrical figure to initialize it's and\040
            calculate perimeter and area or go to another menu:
            1) Circle
            2) Triangle
            3) Rectangle
            E) Go to "Edit Menu"
            S) Go to "Save/Load Menu"
            M) Go to "Main Menu"
            Q) Quit program
            """;
    public static final String EDIT_MENU_MESSAGE = """
            Please, type a number to select an operation or go to another menu:
            1) To edit last figure
            2) To select a figure to edit
            S) Go to "Save/Load Menu"
            C) Go to "Calculate Menu"
            M) Go to "Main Menu"
            Q) Quit program
            """;
    public static final String SAVE_LOAD_MENU_MESSAGE = """
            Please, type a number to select an operation or go to another menu:
            1) Load default file
            2) Load users file
            3) Save as default file
            4) Save as users file
            C) Go to "Calculate Menu"
            E) Go to "Edit Menu"
            M) Go to "Main Menu"
            Q) Quit program
            """;
    public static final String DIRECTORY_SAVE_MESSAGE = """
            Please, type a number to save as:
            1) Default file
            2) New file
            B) Go back to "Save/Delete Menu"
            """;
}
