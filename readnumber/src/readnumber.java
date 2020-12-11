import java.util.Scanner;

public class readnumber {
    public static void main(String[] args) {
        System.out.println("Nhập số có giá tự từ 0 đến 999 :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int tram = num/100;
        int chuc = (num%100)/10;
        int ones = (num%100)%10;
        String strOnes = "";
        if ( num >= 0 & num < 10 ) {
            switch (num) {
                case 0: strOnes = "zero"; break;
                case 1: strOnes = "one"; break;
                case 2: strOnes = "two"; break;
                case 3: strOnes = "three"; break;
                case 4: strOnes = "four"; break;
                case 5: strOnes = "five"; break;
                case 6: strOnes = "six"; break;
                case 7: strOnes = "seven"; break;
                case 8: strOnes = "eight"; break;
                case 9: strOnes = "nine"; break;
            }
            System.out.println(strOnes);
        }
    }
}