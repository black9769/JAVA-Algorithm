import java.util.*;

//짝이 들어간다는 문제는 대부분 스택구조로 풀수 있음
public class Solution {
    public static void main(String[] args) {
        solution(10, 2);
        solution(8, 1);
        solution(24, 24);
        solution(12, 3);
        solution(9, 6);
    }


    public static int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int size = brown + yellow; //타일의 갯수가 곧 사이즈
        for (int i = size; i > 0; i--) { //가장 큰수부터 반복문 시작 -> 가로가 크기때문
            if (size % i == 0 && i >= size / i && size / i > 2) { //자연수로 이루어져있기때문에 나머지가 0이고 가로가 더 크고 세로가 갈색 테두리를 포함해야하기 때문에 2보다 항상 커야함
                int l = i; //가로가 큰 순서대로 i가 가로길이가 됨
                int h = size / i; //사각형 크기 공식에 따라 크기에서 i를 나누면 높이가됨
                if (brown == (l + h) * 2 - 4) { //사각형의 둘레를 구하는 공식에서 모서리가 4번이상 덧셈에 들어갔기때문에 4를 제외시켜줌
                    answer[0] =l;
                    answer[1] =h;
                    break;
                }
            }

        }
        return answer;
    }


}
