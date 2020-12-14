import java.util.Scanner;
public class Rectangle {
    double height, width, perimeter, area;
    Scanner sc = new Scanner(System.in);

    public void input() {
        do {
            System.out.println("Nhập chiều dài");
            height = sc.nextDouble();
            System.out.println("Nhập chiều rộng");
            width = sc.nextDouble();
        } while (height < width);
    }
    public double getPerimeter(double width, double height){
        perimeter = (width+height)*2;
        return perimeter;
    }
    public double getArea(double width, double height){
        area = width*height;
        return area;
    }
    public void display(double perimeter, double area) {
        System.out.println("Chu vi : " + perimeter);
        System.out.println("Diện tích : "+ area);
    }
}
