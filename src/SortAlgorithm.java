import java.util.Arrays;

public class SortAlgorithm {
    static int[] arr = new int[]{7, 1, 3, 2, 4, 5, 6};
    static int cnt =0;

    public static void main(String[] args) {
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length -1; i++) {
            int min_idx = i; //
            for (int j = i +1; j < arr.length; j++) {
                if (arr[j] < arr[min_idx]){
                    min_idx =j;
                }
            }
            swap(min_idx , i); //최솟값과 맨 앞 위치한 값을 교체한다
        }
    }

    private static void swap(int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        cnt++;
    }
}
