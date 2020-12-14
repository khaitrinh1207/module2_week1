public class main {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        rec.input();
        double perimeter = rec.getPerimeter(rec.width, rec.height);
        double area = rec.getArea(rec.width, rec.height);
        rec.display(perimeter, area);
    }
}
