import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static boolean[][] field = new boolean[][]{
            {false, true, false, true, false, true, false, true},
            {true, false, true, false, true, false, true, false},
            {false, true, false, true, false, true, false, true},
            {true, false, true, false, true, false, true, false},
            {false, true, false, true, false, true, false, true},
            {true, false, true, false, true, false, true, false},
            {false, true, false, true, false, true, false, true},
            {true, false, true, false, true, false, true, false}
    };

    static String[][] simulation = new String[8][8];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int cnt = 0;
        for (int i = 0; i < 8; i++) {
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            for (int j = 0; j < 8; j++) {
                char[] arr = str.toCharArray();
                simulation[i][j] = String.valueOf(arr[j]);
                if (!field[i][j] && simulation[i][j].equals("F")) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
