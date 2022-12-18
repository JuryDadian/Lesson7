package hierarchy_figure;

public class Circle extends Figure {
    private final double radius;
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double square() {
        return  square = Math.PI * (radius * radius);
    }

    @Override
    public double perimeter() {
        return perimeter = 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "square=" + square +
                ", perimeter=" + perimeter +
                '}';
    }
}
