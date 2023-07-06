import java.util.*;

//array list로 풀이 실패
public class Solution {
    public static void main(String[] args) {
        solution(3);
        solution(5);
        solution(6);
    }


    public static int solution(int n) {
        int answer = 0;
        int num1 = 1;
        int num2 = 1;

        if (n == 1 || n == 2)
            return 1;
        else {
            for (int i = 3; i <= n; i++) {
                answer = (num1 + num2) % 1234567;
                num1 = num2; // 전전수로 갱신
                num2 = answer; // 전수로 갱신
            }
        }
        return answer;
    }


}
