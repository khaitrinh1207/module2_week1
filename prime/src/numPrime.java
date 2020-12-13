import java.util.Scanner;

public class numPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập n nguyên tố cần in ra:");
        int number = sc.nextInt();
        int count =0;
        int n = 2;

        while ( count < number){
            boolean flag = true;
            for (int i =2 ; i < n ; i++) {
                if (n % i == 0) {
                    flag = false;
                }
            }
                if (flag) {
                    count++;
                    System.out.println(n);
                }
            n++;
        }
    }
}
