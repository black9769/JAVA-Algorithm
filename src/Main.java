import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        Arrays.sort(A);
        int M = sc.nextInt();
        for (int i = 0; i < M; i++) {
            System.out.println(binarySearch2(A, sc.nextInt(), 0, N - 1));
        }
    }

    static int binarySearch2(int[] A, int key, int low, int high) {
        int mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (key == A[mid]) {
                return 1;
            } else if (key < A[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return 0; // 탐색 실패
    }
}
