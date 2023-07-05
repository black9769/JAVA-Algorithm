import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long S = sc.nextLong();
        long N = 0;
        long i = 0;
        while (true) {
            i++;
            N = N + i;
            if (N > S) {
                break;
            }
        }
        System.out.println(i - 1);


    }
}