import java.util.Arrays;

public class SortAlgorithm {
    static int[] arr = new int[]{7, 1, 3, 2, 4, 5, 6};

    public static void main(String[] args) {
        sortBubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sortBubble(int[] arr) {
        boolean isSwap; //교환 여부
        do {
            isSwap = false;
            for (int i = 0; i < arr.length - 2; i++) { //시작부터 순회
                if (arr[i] > arr[i + 1]) {
                    swap(i, i + 1);
                    isSwap = true; //교환 발생
                }
            }
            if (!isSwap) {
                break;
            }
            isSwap = false;
            for (int i = arr.length - 2; i >= 0; i--) { //끝부터 순회
                if (arr[i] > arr[i + 1]) {
                    swap(i, i + 1);
                    isSwap = true;
                }
            }
        } while (isSwap);
    }

    private static void swap(int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
