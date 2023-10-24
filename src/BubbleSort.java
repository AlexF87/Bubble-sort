public class BubbleSort {
    public static int[] sort(int[] arr) {
        boolean bool;
        do {
            bool = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    bool = false;
                }
            }
        } while (!bool);
        return arr;
    }

}
