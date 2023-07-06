import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String strN = String.valueOf(N);
        char[] arrN = strN.toCharArray();
        int compare = 0;
        int cnt = 0;
        while (true) {
            for (char n : arrN) {
                compare = compare + (int) n;
                arrN = swap(arrN, compare);
            }
            int compareN = Integer.parseInt(String.valueOf(arrN));
            if (N == compareN) break;
            cnt++;
        }
        System.out.println(cnt);
    }

    static char[] swap(char[] arrN, int i) {
        arrN[0] = arrN[1];
        arrN[1] = (char) i;
        return arrN;
    }
}