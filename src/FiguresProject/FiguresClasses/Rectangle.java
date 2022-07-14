package FiguresProject.FiguresClasses;

import java.io.Serializable;

import static FiguresProject.Controllers.ControllerMessage.WIDTH_HEIGHT_OF_RECTANGLE_OR_BACK;
import static FiguresProject.Controllers.ControllerMessage.WRONG_PARAMETERS_MESSAGE;
import static FiguresProject.Services.SetParametersService.SCANNER;
import static FiguresProject.Services.SetParametersService.validation;

public class Rectangle extends Figure implements Serializable {
    private double width;
    private double height;

    public Rectangle() {
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getPerimeter() {

        return width * 2 + height * 2;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void getInfo() {
        System.out.printf("""
                Rectangle:
                Width = %2f
                Height = %2f
                Perimeter = %2f
                Area = %2f""", getWidth(), getHeight(), getPerimeter(), getArea());
        System.out.println("\n");
    }

    @Override
    public void initializeFiguresParameters() throws Exception {
        System.out.println(WIDTH_HEIGHT_OF_RECTANGLE_OR_BACK);
        String width = SCANNER.next().toLowerCase();
        if (validation(width)) {
            this.width = Double.parseDouble(width);
            String height = SCANNER.next().toLowerCase();
            if (validation(height)) {
                this.height = Double.parseDouble(height);
            } else {
                System.out.println(WRONG_PARAMETERS_MESSAGE);
                initializeFiguresParameters();
            }
        } else {
            System.out.println(WRONG_PARAMETERS_MESSAGE);
            initializeFiguresParameters();
        }
    }
}
