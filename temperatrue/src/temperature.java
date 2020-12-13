import java.util.Scanner;

public class temperatrue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double F;
        double C;
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. F sang C");
            System.out.println("2. C sang F");
            System.out.println("0. thoát");
            System.out.println("Lựa chọn :");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Nhập F : ");
                    F = sc.nextDouble();
                    System.out.println(" F sang C : "+FtoC(F));
                    break;
                case 2:
                    System.out.println("Nhập C : ");
                    C = sc.nextDouble();
                    System.out.println(" C sang F : "+CtoF(C));
                    break;
                case 0: System.exit(0);
            }
        } while (choice != 0);
    }
    public static double FtoC(double F){
        double C = (5.0/9)*(F-32);
        return C;
    }
    public static double CtoF(double C) {
        double F = (9.0/5)*C+32;
        return F;
    }
}
