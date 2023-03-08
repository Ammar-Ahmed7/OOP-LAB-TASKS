public class Circle extends Shape {
    private double radius;

    public Circle(String colour, boolean shapeIsFilled, double radius) {
        super(colour, shapeIsFilled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
