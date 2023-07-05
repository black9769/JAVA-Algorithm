import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] rope = new int[N];
        for (int i = 0; i < rope.length; i++) {
            rope[i] = sc.nextInt();
        }
        Arrays.sort(rope);
        int max = 0;
        for (int i = rope.length - 1; i >= 0; i--) {
            rope[i] = rope[i] * (N-i);
            if (max < rope[i]) max = rope[i];
        }
        System.out.println(max);
    }
}