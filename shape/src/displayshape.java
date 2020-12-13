import java.util.Scanner;

public class displayshape {
    public static void main(String[] args) {
        int choice = -1;
        while (choice != 0 ) {
        Scanner sc = new Scanner(System.in);
        System.out.println("menu");
        System.out.println("1. Hiển thị hình chữ nhật");
        System.out.println("2. Hiển thị tam giác vuông");
        System.out.println("3. Hiển thị tam giác cân");
        System.out.println("4. Thoát");
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                for (int i = 1; i <= 3; i++) {
                    for (int j = 1; j <= 7; j++) {
                        System.out.print("*" + " ");
                    }
                    System.out.print("\n");
                }
                break;
            case 2:
                for (int i = 1; i <= 5; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*" + " ");
                    }
                    System.out.print("\n");
                }
                System.out.println("và");
                for (int i = 5; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*" + " ");
                    }
                    System.out.print("\n");
                }
                break;
            case 3:
                for (int i = 1; i <= 5; i++) {
                    for (int j = 1; j <= 5 - i; j++) {
                        System.out.print(" " + " ");
                    }
                    for (int j = 5 - i + 1; j <= 5 + i - 1; j++) {
                        System.out.print("*" + " ");
                    }
                    System.out.print("\n");
                }
                break;
        }
        }
    }
}
