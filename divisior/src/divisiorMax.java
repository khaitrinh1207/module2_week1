import java.util.Scanner;

public class divisiorMax {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner inp = new Scanner(System.in);
        System.out.println("Nhập A : ");
        a = inp.nextInt();
        a = Math.abs(a);
        System.out.println("Nhập B :");
        b = inp.nextInt();
        b = Math.abs(b);
        if (a == 0 || b == 0)
            System.out.println("Không có ước chung lớn nhất");
        while ( a != b){
            if ( a > b )
                a = a - b;
            else
                b = b - a;
        }
        System.out.println("ước chung lớn nhất là : " +a);
    }
}
