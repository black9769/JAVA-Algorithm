import java.util.*;

//array list로 풀이 실패
public class Solution {
    public static void main(String[] args) {
        solution(new int[]{6, 10, 2});
        System.out.println();
        solution(new int[]{3, 30, 34, 5, 9});
    }


    public static String solution(int[] numbers) {
        String answer = "";
        int output[] = new int[numbers.length];
        boolean visited[] = new boolean[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            permutation(numbers, output, visited, 0, numbers.length);
        }

        return answer;
    }

    public static void permutation(int[] numbers, int[] output, boolean[] visited, int depth, int r) {
        int size = factorial(numbers.length);
        int[] a = new int[size];
        if (depth == r) {
            for (int i = 0; i < r; i++) {
                System.out.printf("%d", output[i]);
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < numbers.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                output[depth] = numbers[i];
                permutation(numbers, output, visited, depth + 1, r);
                visited[i] = false;
            }
        }
    }

    static int factorial(int n) {
        int ans = 1;
        for (int i = 1; i <= n; i++) {
            ans *= i;
        }
        return ans;
    }


}
