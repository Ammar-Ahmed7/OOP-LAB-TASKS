public class Shape {
    private String colour;
    private boolean ShapeIsFilled;

    public Shape(String colour, boolean shapeIsFilled) {
        this.colour = colour;
        ShapeIsFilled = shapeIsFilled;
    }

    public int getArea(int length, int width){
       // return length * width;
    return 0;
    }
    public int getPerimeter(int length, int width){
        //return 2* (length+width);
    return 0;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean isShapeIsFilled() {
        return ShapeIsFilled;
    }

    public void setShapeIsFilled(boolean shapeIsFilled) {
        ShapeIsFilled = shapeIsFilled;
    }
}
