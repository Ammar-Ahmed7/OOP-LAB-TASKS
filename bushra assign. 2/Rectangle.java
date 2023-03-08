public class Rectangle extends Shape{
    private double length;
    private double width;

    public Rectangle(String colour, boolean shapeIsFilled, double length, double width) {
        super(colour, shapeIsFilled);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
