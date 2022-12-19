package hierarchy_figure;

public class Triangle extends Figure {
    private final double a;
    private final double b;
    private final double base;
    private final double h;

    public Triangle (double a, double b, double base, double h) {
        this.a = a;
        this.b = b;
        this.base = base;
        this.h = h;
    }

    @Override
    public double square() {
        return square = base * h / 2;
    }
    @Override
    public double perimeter() {
        return perimeter = a + b + base;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "square=" + square +
                ", perimeter=" + perimeter +
                '}';
    }
}
