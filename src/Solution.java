import java.util.*;

//array list로 풀이 실패
public class Solution {
    public static void main(String[] args) {
        solution("110010101001");
        solution("01110");
        solution("1111111");
    }


    public static int[] solution(String s) {
        int[] answer = new int[2];
        int cnt = 0;
        int count = 0;
        while (true) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) - '0' == 0) {
                    cnt++;
                }
            }
            count++;
            s = s.replaceAll("[^1]", "");
            s = Integer.toBinaryString(s.length());
            if (s.equals("1")) break;
        }
        answer[0] = count;
        answer[1] = cnt;

        return answer;
    }
}
