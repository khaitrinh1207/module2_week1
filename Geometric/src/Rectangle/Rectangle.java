package Rectangle;

import Shape.Shape;

public class Rectangle extends Shape {
    private double length = 10;
    private double width = 5;

    public Rectangle() {
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

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public Rectangle(double length,double width, String color, boolean filled){
        super(color,filled);
        this.length = length;
        this.width = width;
    }

    public double getArea(double length, double width) {
        return length * width;
    }

    public double getPerimeri(double length, double width) {
        return (length + width) * 2;
    }

    @Override
    public String toString() {
        return "width : " + width + " length : " + length
                + " area : " + getArea(length, width)
                + " perimeter : " + getPerimeri(length, width)
                +" color : "+ getColor()
                +" fill : "+isFilled();
    }
}
