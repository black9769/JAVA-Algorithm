import java.util.*;

//짝이 들어간다는 문제는 대부분 스택구조로 풀수 있음
public class Solution {
    public static void main(String[] args) {
        solution(new int[][]{{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}});
    }


    public static int solution(int[][] triangle) {
        int answer =0;
        for(int i = 1; i < triangle.length ; i++) {
            for(int j = 0; j < triangle[i].length ; j++) {
                if(j == 0) {//왼쪽 끝
                    triangle[i][j] += triangle[i-1][j];
                }
                else if(j == i) {//오른쪽 끝
                    triangle[i][j] += triangle[i-1][j-1];
                }
                else {
                    triangle[i][j] += Math.max(triangle[i-1][j], triangle[i-1][j-1]);
                }
                answer = Math.max(answer, triangle[i][j]);
            }
        }
        return answer;
    }


}
