import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fst = sc.nextInt();
        int sec = sc.nextInt();
        int result = sec + (sec - fst);
        System.out.println(result);
    }
}
