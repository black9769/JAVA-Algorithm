import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        for (int i = 0; i < test_case; i++) {
            int n = sc.nextInt();
            System.out.printf("Pairs for %d: ", n);
            List<String> numList = new ArrayList<>();
            for (int j = 1; j < 13; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (j + k == n) {
                        String jStr = String.valueOf(j);
                        String kStr = String.valueOf(k);
                        String numStr = jStr + " " + kStr;
                        numList.add(numStr);
                    }
                }
            }
            for (int j = 0; j < numList.size(); j++) {
                System.out.printf("%s", numList.get(j));
                if (j != numList.size()-1) System.out.printf(", ");
            }
            System.out.println();
        }

    }
}
