package Square;

import Rectangle.Rectangle;

public class Square extends Rectangle {
    public Square() {
    }
    public Square(double side) {
        super(side, side);
    }
    public Square(double side, String color, boolean filled){
        super(side,side,color,filled);
    }
    public double getSide(){
        return getWidth();
    }
    public void setSide(double side){
        setWidth(side);
        setLength(side);
    }
    public double getArea(double side){
        return side*side;
    }
    public double getPerimeter(double side){
        return side*4;
    }
    @Override
//    public void setWidth(double width){
//        setSide(width);
//    }
//    public void setLength(double length){
//        setSide(length);
//    }
    public String toString(){
        return "side : "+getSide()
                + " area : "+getArea(getSide())
                + " perimeter : "+getPerimeter(getSide())
                + " color : "+getColor()
                + " fill : "+isFilled();
    }

}
