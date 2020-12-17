package Circle;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.m1();
        System.out.println(circle);

        Circle circle1 = new Circle(2,"white",true);
        circle1.setRadius(5);
        System.out.println(circle1);
    }
}
