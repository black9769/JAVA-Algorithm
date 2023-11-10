import java.util.Arrays;

public class SortAlgorithm {
    static int[] arr = new int[]{7, 1, 3, 2, 4, 5, 6};

    public static void main(String[] args) {
        sortBubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sortBubble(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            System.out.printf("%d 라운드 ", i);
            System.out.printf("%d 비교 횟수", arr.length - i);
            System.out.println();
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[i] < arr[j]) {
                    swap(i, j);
                }
            }
        }
    }

    private static void swap(int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
