import java.util.Arrays;

public class combineArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5,10};
        int[] arr2 = {6, 7, 8, 9,11};
        int[] arr3 = new int[arr1.length + arr2.length];
        System.out.println("duyệt arr1");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        System.out.println("duyệt arr2");
        for (int j = 0; j < arr2.length; j++) {
            System.out.println(arr2[j]);
        }
        // thêm arr1 vào arr3
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        // thêm arr2 vào arr3
        int count = arr1.length;
        for (int i = 0; i < arr2.length; i++) {
            arr3[count++] = arr2[i];
        }
        System.out.println(Arrays.toString(arr3));

    }
}
