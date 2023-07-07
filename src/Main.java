import java.io.BufferedReader;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String str = String.valueOf(N);
        int len = str.length();
        Integer[] arr = new Integer[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = N % 10;
            N /= 10;
        }
        Arrays.sort(arr, Collections.reverseOrder());
        for (Integer i : arr){
            System.out.printf("%d", i);
        }
    }
}