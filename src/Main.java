import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < tc; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int mod = b % 4;
            int[] arr = squareRule(a);
            if (arr[mod] == 0) System.out.println(10);
            else System.out.println(arr[mod]);

        }
    }

    static int[] squareRule(int a) {
        int[] arr = new int[4];
        arr[1] = a % 10;
        arr[2] = arr[1] * a % 10;
        arr[3] = arr[2] * a % 10;
        arr[0] = arr[3] * a % 10;
        return arr;

    }
}