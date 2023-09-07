import java.util.*;

//동적 프로그래밍의 기본적인 문제 lv3
public class Solution {
    public static void main(String[] args) {
        solution(new int[]{2, 3, -6, 1, 3, -1, 2, 4});
    }


    public static long solution(int[] sequence) {
        long answer = 0;
        int size = sequence.length;

        //펄스 연산을 하게 되면 두가지 조건으로만 나올수 있다.
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) a[i] = sequence[i];
            else a[i] = sequence[i] * -1;
        }
        int[] b = new int[size];
        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) b[i] = sequence[i] * -1;
            else b[i] = sequence[i];
        }
        //최대값을 dp에 넣어서 비교한다.
        long[] dp1 = new long[size];
        long[] dp2 = new long[size];

        dp1[0] = a[0];
        dp2[0] = b[0];
        answer = Math.max(dp1[0], dp2[0]);

        for (int i = 1; i < size; i++) {
            dp1[i] = Math.max(dp1[i-1] + a[i] , a[i]);
            dp2[i] = Math.max(dp2[i-1] + b[i] , b[i]);


            long max = Math.max(dp1[i], dp2[i]);
            answer = Math.max(answer, max);
        }
        return answer;
    }


}
