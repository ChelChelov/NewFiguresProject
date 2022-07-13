package FiguresProject.FiguresClasses;

import java.io.Serializable;

import static FiguresProject.Controllers.ControllerMessage.RADIUS_OF_CIRCLE_OR_BACK;
import static FiguresProject.Controllers.ControllerMessage.WRONG_PARAMETERS_MESSAGE;
import static FiguresProject.Services.SetParametersService.SCANNER;
import static FiguresProject.Services.SetParametersService.validation;

public class Circle extends Figure implements Serializable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {

    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * PI * this.radius;
    }

    @Override
    public double getArea() {
        return PI * this.radius * radius;
    }

    @Override
    public void getInfo() {
        System.out.printf("""
                Circle:
                Radius = %f
                Perimeter = %f
                Area = %f""", getRadius(), getPerimeter(), getArea());
        System.out.println("\n");
    }

    @Override
    public void initializeFiguresParameters() throws Exception {
        System.out.println(RADIUS_OF_CIRCLE_OR_BACK);
        String radius = SCANNER.next().toLowerCase();
        if (validation(radius)) {
            this.radius = Double.parseDouble(radius);
        } else {
            System.out.println(WRONG_PARAMETERS_MESSAGE);
            initializeFiguresParameters();
        }
    }

    @Override
    public void changeFiguresParameters() {

    }
}


