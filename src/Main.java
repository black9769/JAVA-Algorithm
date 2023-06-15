import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt =0;
        while (true) {
            cnt++;
            int N0 = sc.nextInt();
            if (N0 == 0) break;
            int N1 = N0 * 3;
            int N2;
            if (N1 % 2 == 0) { //짝수
                N2 = N1 / 2;
                System.out.printf("%d. even",cnt);
            } else {// 홀수
                N2 = (N1 + 1) / 2;
                System.out.printf("%d. odd",cnt);
            }
            int N3 = N2 * 3;
            int N4 = N3/9;
            System.out.printf(" %d", N4);
            System.out.println();
        }
    }
}