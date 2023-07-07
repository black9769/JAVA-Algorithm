import java.io.BufferedReader;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] strArr = new String[N];
        for (int i = 0; i < N; i++) {
            String str = sc.next();
            strArr[i] = str;
        }
        String[] resultArr = Arrays.stream(strArr).distinct().toArray(String[]::new);
        Arrays.sort(resultArr, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if (s1.length() == s2.length()) return s1.compareTo(s2);
                else return s1.length() - s2.length();
            }
        });

        for (String str : resultArr){
            System.out.println(str);
        }
    }
}