import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[random.nextInt(100)];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.floor(Math.random()*100) + 1);

        }
        arr = BubbleSort.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}