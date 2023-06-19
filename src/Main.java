import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, String> titleMap = new HashMap<>();
        int tc = sc.nextInt();
        for (int i = 0; i < tc; i++) {
            String title = sc.next();
            int level = sc.nextInt();
            titleMap.put(level, title);
        }
        List<Integer> keySet = new ArrayList<>(titleMap.keySet());
        Collections.sort(keySet);
        System.out.println(titleMap.get(keySet.get(0)));
    }
}