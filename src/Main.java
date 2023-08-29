import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = sc.nextInt();
        n = n - (n % 100);
        while (true) {
            if (n % f == 0) {
                break;
            } else {
                n++;
            }
        }
        int ans = n % 100;
        System.out.printf("%02d", ans);
        System.out.println();
    }
}