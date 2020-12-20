import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Stopwatch stopWatch = new Stopwatch();
        stopWatch.start();
        int [] array = new int[300000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*100);
        }
        Arrays.sort(array);
//        System.out.println(Arrays.toString(array));
        stopWatch.stop();
        System.out.println("Distance time in milli second "+stopWatch.getElapsedTime());
    }
}
