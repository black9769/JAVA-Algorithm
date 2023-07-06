import java.util.*;

//array list로 풀이 실패
public class Solution {
    public static void main(String[] args) {
        solution(10000);
        solution(15);
        solution(1);
    }


    public static int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            int sum = i;
            if (sum == n) {
                answer++;
                break;
            }
            for (int j = i + 1; j <= n; j++) {
                sum += j;
                if (sum == n) answer++;
                else if (sum > n) break;
            }
        }
        return answer;
    }
}
