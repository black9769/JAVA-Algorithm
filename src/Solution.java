import java.util.*;

// 스택 활용
// 스택 함수
// stack.peek -> 가장 위에 있는 값
public class Solution {
    public static void main(String[] args) {
        solution(new int[]{1,1,3,3,0,1,1});
    }

    static  Stack<Integer> solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        for (int i : arr) {
            if (stack.empty() || stack.peek() != i) stack.push(i);
        }
        System.out.println(stack);
        return stack;
    }

}