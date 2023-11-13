import java.util.Arrays;

public class SortAlgorithm {
    static int[] arr = new int[]{7, 1, 3, 2, 4, 5, 6};
    static int cnt = 0;

    public static void main(String[] args) {
        interSectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void interSectionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {

            int target = arr[i];
            int j = i - 1;

            while (j >= 0 && target < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = target;
        }
    }
}
