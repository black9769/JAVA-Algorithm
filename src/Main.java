import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int i = 0; i < tc; i++) {
            int n = sc.nextInt();
            int result = 0;
            for (int j = 1; j <= n; j++) {
                if (j%2 ==1) result += j;
            }
            System.out.println(result);
        }
    }
}
