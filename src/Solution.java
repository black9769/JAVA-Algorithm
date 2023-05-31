import java.util.*;

//
public class Solution {
    public static void main(String[] args) {
        solution(new int[]{93, 30, 55}, new int[]{1, 30, 5});
        solution(new int[]{95, 90, 99, 99, 80, 99}, new int[]{1, 1, 1, 1, 1, 1});
    }

    static List<Integer> solution(int[] progresses, int[] speeds) {
        Stack<Integer> stack = new Stack<>(); //스택 생성
        HashMap<Integer, Integer> hashMap = new HashMap<>(); //결과 값을 위한 Map
        for (int i = 0; i < progresses.length; i++) { //스택에 결과 값을 넣는 과정
            if (stack.empty() || stack.peek() < Math.ceil((100 - progresses[i]) / (double) speeds[i])) {
                // 스택이 비거나 스택 상단 값이 그 다음에 들어갈 값보다 작으면 새로운 값을 넣어주고 맵을 생성해줌
                stack.push((int) Math.ceil((100 - progresses[i]) / (double) speeds[i]));
                hashMap.put((int) Math.ceil((100 - progresses[i]) / (double) speeds[i]), 1);
            } else {
                stack.push(stack.peek()); //그게 아닐시 상단 값을 넣어줌
                if (hashMap.containsKey(stack.peek())) { //해쉬에 같은 값이 있으면 가능 배포 일을 하루 추가
                    hashMap.put(stack.peek(), hashMap.get(stack.peek()) + 1);
                }
            }
        }

        List<Integer> keySet = new ArrayList<>(hashMap.keySet()); // 맵을 키값으로 정렬하기 위해 리스트안에 넣어줌
        Collections.sort(keySet); //키값으로 정렬
        List<Integer> answer = new ArrayList<>(); //결과 값을 구하기 위한 리스트 생성
        for (Integer integer : keySet) {
            answer.add(hashMap.get(integer)); //정답에  value 추가
        }
        return answer;
    }

}