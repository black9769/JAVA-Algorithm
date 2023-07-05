import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        for (int i = 0; i < tc; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int count = Integer.parseInt(st.nextToken());
            int[][] person = new int[count][2];
            for (int j = 0; j < count; j++) {
                st = new StringTokenizer(br.readLine());
                person[j][0] = Integer.parseInt(st.nextToken());
                person[j][1] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(person, new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    return Integer.compare(o1[0], o2[0]);
                }
            });
            checkHap(person);
        }
    }

    private static void checkHap(int[][] person) {
        int pivot = person[0][1];
        int cnt = 1; // 정렬된 첫번째 사람은 채용
        for (int i = 0; i < person.length; i++) {
            if (person[i][1] < pivot) {
                pivot = person[i][1];
                cnt++;
            }

        }
        System.out.println(cnt);
    }
}
