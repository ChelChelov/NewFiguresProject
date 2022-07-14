package FiguresProject.FiguresClasses;

import java.io.Serializable;

public abstract class Figure implements Serializable {
    public static final double PI = Math.PI;

    public abstract double getPerimeter();

    public abstract double getArea();

    public abstract void getInfo();

    public abstract void initializeFiguresParameters() throws Exception;

}
