import java.util.*;

//array list로 풀이 실패
public class Solution {
    public static void main(String[] args) {
        solution(3,new int[][]{{1,1,0},{1,1,0},{0,0,1}});
        solution(3,new int[][]{{1,1,0},{1,1,0},{0,0,1}});
    }


    public static int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visited = new boolean[computers.length];
        for (int i =0 ; i <computers.length ; i++){
            visited[i] = false;
        }

        for (int i =0 ; i< computers.length;i++){
            if (visited[i]== false){
                answer++;
                dfs(i,visited,computers);
            }
        }

        return answer;
    }

    static void dfs(int node, boolean[] visited, int[][] computer){
        visited[node] =true;
        for (int i = 0; i < computer.length; i++) {
            if (visited[i] ==false && computer[node][i] ==1){
                dfs(i,visited,computer);
            }

        }
    }


}