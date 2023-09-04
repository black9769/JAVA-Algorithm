import java.util.*;

//짝이 들어간다는 문제는 대부분 스택구조로 풀수 있음
public class Solution {
    public static void main(String[] args) {
        solution("baabaa");
    }


    public static int solution(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c: s.toCharArray()){
            if(!stack.isEmpty() && stack.peek() == c) stack.pop();
            else stack.push(c);

        }
        return stack.isEmpty() ? 1 : 0;
    }


}
