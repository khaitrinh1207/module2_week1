package Rectangle;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        System.out.println(rec);
        rec.setColor("black");
        rec.setLength(60);
        rec.setFilled(false);
        System.out.println(rec);
    }
}
