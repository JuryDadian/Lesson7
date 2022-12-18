package hierarchy_figure;

public class Rectangle extends Figure {
    private final double a;
    private final double b;

    public Rectangle (double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double square() {
        return square = a * b;
    }

    @Override
    public double perimeter() {
        return perimeter = a + b * 2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "square=" + square +
                ", perimeter=" + perimeter +
                '}';
    }
}
