import java.util.*;

//array list로 풀이 실패
public class Solution {
    public static void main(String[] args) {

        solution(new int[]{1, 2, 3, 9, 10, 12}, 7);
        solution(new int[]{1, 2, 3, 9, 10, 12}, 100);
        solution(new int[]{1, 1, 2, 6}, 24);
        solution(new int[]{4, 5, 2, 4}, 1);
    }


    static int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int i : scoville) {
            priorityQueue.add(i);
        }
        int min = priorityQueue.peek();
        while (K > min && priorityQueue.size() >1){
            answer++;
            int a = priorityQueue.poll();
            int b = priorityQueue.poll();
            int result = a + (b*2);
            priorityQueue.add(result);
            min = priorityQueue.peek();
        }

        if (K>min){
            return -1;
        }


        return answer;
    }


}