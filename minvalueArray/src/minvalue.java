public class minvalue {
    public static void main(String[] args) {
        int[] arr = {4,12,7,8,1,6,9};
        int min = arr[0];
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if ( arr[i] < min){
                min = arr[i];
                index = i;
            }
        }
        System.out.println("Phần tử nhỏ nhất trong mảng : "+min+" vị trí : " + index);
    }

}
