package hierarchy_figure;

public class Сircle extends Figure {

    private double radius;

    public Сircle(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateSquare() {
        double square = Math.PI * (radius * radius);
        setSquare(square);
    }

    @Override
    public double calculatePerimeter() {
        double perimeter = 2 * Math.PI * radius;
        setPerimeter(perimeter);
        return perimeter;
    }
}
