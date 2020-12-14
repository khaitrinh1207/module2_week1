import java.util.Scanner;

public class findMaxValue {
    public static void main(String[] args) {
        // khai báo số hàng và số cột
        int x,y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số hàng :");
        x = sc.nextInt();
        System.out.println("Nhập số cột :");
        y = sc.nextInt();

        // khai báo mảng hai chiều
        double[][] arr = new double[(int) x][(int)y];
        System.out.println("Nhập các phần tử trong mảng");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.println("arr["+i+"]"+"["+j+"]");
                arr[i][j] = sc.nextDouble();
            }
        }
        // tìm phần tử lớn nhất
        double max = arr[0][0];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if ( arr[i][j] > max)
                    max = arr[i][j];
            }
        }
        System.out.println("phần tử lớn nhất là : "+max);
    }
}
