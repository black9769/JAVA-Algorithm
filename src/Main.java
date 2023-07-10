import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int t = 0; t < tc; t++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            int b = Integer.parseInt(st.nextToken());
            int[] ho = new int[b];
            int[] dp = new int[b];
            for (int i = 1; i <= b; i++) {
                ho[i - 1] = i;
            }
            while (a-- > 0) {
                dp[0] = 1;
                for (int i = 1; i < dp.length; i++) {
                    dp[i] = dp[i - 1] + ho[i];
                    ho[i] =dp[i];
                }
            }
            System.out.println(dp[b - 1]);
        }


    }
}