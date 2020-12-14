import java.util.Arrays;
import java.util.Scanner;

public class pushElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng :");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập phần tử "+(i+1)+" :");
            arr[i] = sc.nextInt();
        }
        System.out.println("Mảng : "+Arrays.toString(arr));
        System.out.println("Nhập x cần chèn vào mảng :");
        int x = sc.nextInt();
        System.out.println("Nhập vị trí trong mảng:");
        int index = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (i == index) {
                for (int j = arr.length-1; j > index; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[index]= x;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
