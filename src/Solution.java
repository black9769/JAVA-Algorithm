import java.util.*;
//스케듈링을 하는 알고리즘이랑 동일
public class Solution {
    public static void main(String[] args) {
        solution(new int[][]{{4, 5}, {4, 8}, {10, 14}, {11, 13}, {5, 12}, {3, 7}, {1, 4}});
    }


    public static int solution(int[][] targets) {
        int answer = 0;
        //종점을 기준으로 오름차순 정렬
        Arrays.sort(targets, (o1, o2) -> {
            if(o1[1] == o2[1]){
                return o1[0] - o2[0];
            }
            return o1[1] - o2[1];
        });
        //첫번째를 기준으로 미사일 요격
        int end = targets[0][1];
        answer++; // 첫 번째로 만들어지는 요격 시스템

        for(int[] tar : targets){
            if(tar[0] >= end){
                end = tar[1];
                answer++; // 시점이 요격 시스템의 상한보다 오른쪽에 있기 때문에 새로운 요격 시스템 추가
            }
        }
        return answer;
    }


}
