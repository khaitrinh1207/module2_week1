import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        StopWatch stopWatch=new StopWatch();
        stopWatch.start();
        int [] array=new int[200000];
        for (int i = 0; i <200000 ; i++) {
            array[i]=i+1;
        }
        Arrays.sort(array);
        stopWatch.stop();
        System.out.println(stopWatch.getElapsedTime());

    }
}