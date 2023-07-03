import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        for (int i = 0; i < tc; i++) {
            int ans = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            int startX = Integer.parseInt(st.nextToken());
            int startY = Integer.parseInt(st.nextToken());
            int endX = Integer.parseInt(st.nextToken());
            int endY = Integer.parseInt(st.nextToken());
            int planetCount = Integer.parseInt(br.readLine());
            for (int j = 0; j < planetCount; j++) {
                st = new StringTokenizer(br.readLine());
                int planetX = Integer.parseInt(st.nextToken());
                int planetY = Integer.parseInt(st.nextToken());
                int r = Integer.parseInt(st.nextToken());
                boolean startCheck = false;
                boolean endCheck = false;
                if (Math.pow(r, 2) >= (Math.pow(startX - planetX, 2) + Math.pow(startY - planetY, 2))) {
                    startCheck = true;
                }
                if (Math.pow(r, 2) >= (Math.pow(endX - planetX, 2) + Math.pow(endY - planetY, 2))) {
                    endCheck = true;
                }
                if (startCheck && !endCheck) ans++;
                else if (!startCheck && endCheck) ans++;
            }
            System.out.println(ans);
        }


    }
}