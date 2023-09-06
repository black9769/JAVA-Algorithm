import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//시험장수
        long[] arr = new long[n];//시험장
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();//시험장 총원
        }
        int b = sc.nextInt(); //총감독이 감독할 수있는 인원수
        int c = sc.nextInt(); //서브감독이 감독할 수 있는 인원수
        long total = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] - b;//총감독이 감독하고 남은 인원수
        }
        total += n;
        for (int i = 0; i < n; i++) {
            if (arr[i] <= 0) continue;
            long num =  (long)Math.ceil((double) arr[i] / (double)c);
            total += num;
        }
        System.out.println(total);
    }
}