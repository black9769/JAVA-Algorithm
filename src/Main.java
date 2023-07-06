import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        int number = Integer.parseInt(N);
        char[] arrN = N.toCharArray();
        int[] num = new int[2];
        if (number < 10) {
            num[1] = number;
        } else {
            for (int i = 0; i < num.length; i++) {
                num[i] = arrN[i] - '0';
            }
        }
        int cnt = 0;
        while (true) {
            int sum;
            if (num[0] + num[1] < 10) {
                sum = num[0] + num[1];
            } else {
                sum = (num[0] + num[1]) % 10;
            }
            num = swap(num, sum);
            int aa = makeInteger(num);
            cnt++;
            if (number == aa) break;
        }
        System.out.println(cnt);
    }

    static int[] swap(int[] arr, int sum) {
        arr[0] = arr[1];
        arr[1] = sum;
        return arr;
    }

    static int makeInteger(int[] num) {
        return num[0] * 10 + num[1];
    }

}