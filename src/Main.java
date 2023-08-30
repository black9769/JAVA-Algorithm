import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] height = new int[9];
        int sum = 0; //9명의 키의 총합을 구한다
        for (int i = 0; i < height.length; i++) {
            height[i] = sc.nextInt();
            sum += height[i];
        }
        for (int i = 0; i < 8; i++) { //첫번째 인덱스를 고정
            for (int j = i + 1; j < 9; j++) { //그 다음 인덱스 부터 진행하면서
                if (sum - height[i] - height[j] == 100) { //키의 총합에서 첫번째 인덱스와 다음으로 진행되는 인덱스 값의 차가 100일때
                    height[i] = 0; // 정렬해서 앞서 두개를 제외시키기 위해  -> 오름차순 정렬 Skill
                    height[j] = 0;
                    Arrays.sort(height);
                    for (int k = 2; k < 9; k++) {
                        System.out.println(height[k]);
                    }
                    return;
                }
            }
        }

    }
}