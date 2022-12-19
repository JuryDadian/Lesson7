package hierarchy_figure;

import hierarchy_figure.Circle;
import hierarchy_figure.Figure;
import hierarchy_figure.Rectangle;
import hierarchy_figure.Triangle;

import java.util.Arrays;

public class Main {
     public static void main(String[] args) {
        Triangle figureTriangle1 = new Triangle(4, 4, 4, 3);
        figureTriangle1.square();
        figureTriangle1.perimeter();
        System.out.println(figureTriangle1);

        Rectangle figureRectangle1 = new Rectangle(4, 6);
        figureRectangle1.square();
        figureRectangle1.perimeter();
        System.out.println(figureRectangle1);

        Circle figureCircle = new Circle(5);
        figureCircle.square();
        figureCircle.perimeter();
        System.out.println(figureCircle);

        Triangle figureTriangle2 = new Triangle(3, 6, 7, 4);
        figureTriangle2.square();
        figureTriangle2.perimeter();
        System.out.println(figureTriangle2);

        Rectangle figureRectangle2 = new Rectangle(8, 18);
        figureRectangle2.square();
        figureRectangle2.perimeter();
        System.out.println(figureRectangle2);

        Figure[] arrayFigure = new Figure[]{figureRectangle1, figureTriangle1, figureCircle, figureRectangle2, figureTriangle2};
        System.out.println("Массив всех фигур: " + Arrays.toString(arrayFigure));

        double sumPerimeter = 0;

        for (Figure figure : arrayFigure) {
            sumPerimeter = sumPerimeter + figure.perimeter();
        }
        System.out.println("Сумма периметров всех фигур в массиве равна: " + sumPerimeter);
    }

}