import java.util.Scanner;

public class findvalueArray {
    public static void main(String[] args) {
        int choice = -1;
        while (choice != 0) {
            String[] students = {"Duyệt", "Khải", "Mừng", "Dũng", "Hoàn", "Bách", "Toàn", "Hiếu"};
            Scanner sc = new Scanner(System.in);
            String input_name = sc.nextLine();
            boolean flag = false;
            for (int i = 0; i < students.length; i++) {
                if (students[i].equals(input_name)) {
                    System.out.println("vị trí của sinh viên trong mảng là : " + input_name + " là " + (i + 1));
                    flag = true;
                    break;
                }
            }
            if (!flag)
                System.out.println("Không tìm thấy :" + input_name + " trong danh sách");
        }
    }
}
