import java.util.Arrays;
import java.util.Scanner;

public class delElementArr {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhập độ dài của mảng:");
            size = sc.nextInt();
            if (size > 10) ;
            System.out.println("Mảng chứa tối đa 10 phần tử");
        } while (size > 10);
        arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập phần tử vào mảng " + (i + 1) + " :");
            arr[i] = sc.nextInt();
        }
        System.out.println("Mảng hiện tại : " + Arrays.toString(arr));
        System.out.println("Nhập số muốn xóa trong mảng :");
        int num = sc.nextInt();
        int a = findIndex(arr,num);
        delNum(arr,a);
        System.out.println("Mảng sau khi xóa : "+ Arrays.toString(arr));
    }

    public static int findIndex(int[] arr, int num) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                index = i;
            }
        }
        return index;
    }

    public static void delNum(int[] arr, int index) {
        if (index >= 0) {
            for (int i = index; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[arr.length - 1] = 0;
        } else {
            System.out.println("không có số trong mảng");
        }
    }
}

