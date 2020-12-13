import java.util.Scanner;

public class maxvalue {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhập độ dài mảng:");
            size = sc.nextInt();
            if ( size > 20)
                System.out.println("Độ dài không quá 20");
        } while (size > 20);
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhập phần tử :"+(i+1));
            array[i] = sc.nextInt();
        }
        System.out.println("thuộc tính danh sách :");
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j]+"\t");
        }
        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if ( array[j] > max ){
                max = array[j];
                index = j+1;
            }
        }
        System.out.println("giá trị lớn nhất là : "+max+"\n"+"vị trí : "+index);
    }
}
