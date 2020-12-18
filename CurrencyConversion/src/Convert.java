import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {
        double USD;
        double VND = 23000;
        System.out.println("Nhập giá trị USD cần quy đổi: ");
        Scanner sc = new Scanner(System.in);
        USD = sc.nextDouble();
        double convert = USD * VND;
        System.out.println("Giá trị quy đổi : "+convert+" VND");
    }
}
