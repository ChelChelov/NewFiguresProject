package FiguresProject.FiguresClasses;

import java.io.Serializable;

import static FiguresProject.Controllers.ControllerMessage.TRIANGLE_LINES_OR_BACK;
import static FiguresProject.Controllers.ControllerMessage.WRONG_PARAMETERS_MESSAGE;
import static FiguresProject.Services.SetParametersService.SCANNER;
import static FiguresProject.Services.SetParametersService.validation;

public class Triangle extends Figure implements Serializable {
    private double firstLine;
    private double secondLine;
    private double thirdLine;

    public Triangle(double firstLine, double secondLine, double thirdLine) {
        this.firstLine = firstLine;
        this.secondLine = secondLine;
        this.thirdLine = thirdLine;
    }

    public Triangle() {

    }

    public double getFirstLine() {
        return firstLine;
    }

    public void setFirstLine(double firstLine) {
        this.firstLine = firstLine;
    }

    public double getSecondLine() {
        return secondLine;
    }

    public void setSecondLine(double secondLine) {
        this.secondLine = secondLine;
    }

    public double getThirdLine() {
        return thirdLine;
    }

    public void setThirdLine(double thirdLine) {
        this.thirdLine = thirdLine;
    }

    @Override
    public double getPerimeter() {
        return firstLine + secondLine + thirdLine;
    }

    @Override
    public double getArea() {
        double semiPerimeter = (firstLine + secondLine + thirdLine) / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - firstLine) * (semiPerimeter - secondLine) *
                (semiPerimeter - thirdLine));
    }

    @Override
    public void getInfo() {
        System.out.printf("""
                Triangle:
                First line = %2f
                Second line = %2f
                Third line = %2f
                Perimeter = %2f
                Area = %2f""", getFirstLine(), getSecondLine(), getThirdLine(), getPerimeter(), getArea());
        System.out.println("\n");
    }

    @Override
    public void initializeFiguresParameters() throws Exception {
        System.out.println(TRIANGLE_LINES_OR_BACK);
        String firstLine = SCANNER.next().toLowerCase();
        if (validation(firstLine)) {
            this.firstLine = Double.parseDouble(firstLine);
            String secondLine = SCANNER.next().toLowerCase();
            if (validation(secondLine)) {
                this.secondLine = Double.parseDouble(secondLine);
                String thirdLine = SCANNER.next().toLowerCase();
                if (validation(thirdLine)) {
                    this.thirdLine = Double.parseDouble(thirdLine);
                } else {
                    System.out.println(WRONG_PARAMETERS_MESSAGE);
                    initializeFiguresParameters();
                }
            } else {
                System.out.println(WRONG_PARAMETERS_MESSAGE);
                initializeFiguresParameters();
            }
        } else {
            System.out.println(WRONG_PARAMETERS_MESSAGE);
            initializeFiguresParameters();
        }
    }

    @Override
    public void changeFiguresParameters() {

    }
}
