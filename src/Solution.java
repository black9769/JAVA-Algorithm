import java.util.*;

//스케듈링을 하는 알고리즘이랑 동일
public class Solution {
    public static void main(String[] args) {
        solution(2, 9);
        solution(2, 2);
        solution(2, 1);
        solution(2, 8);
    }

    public static int[] solution(int n, int s) {
        if(n > s) return new int[]{-1};
        int[] answer= new int[n];
        Arrays.fill(answer, s / n);
        for (int i = 0; i < s%n; i++) {
            answer[i] ++;
        }

        Arrays.sort(answer);

        return answer;
    }


}
