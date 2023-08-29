import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        String mul = String.valueOf(a * b * c);
        int[] arr = new int[10];
        for (int i = 0; i < mul.length(); i++) {
            int num = mul.charAt(i) - 48 ;
            for (int j = 0; j < arr.length ; j++){
                if (j == num)  {
                    arr[j] ++;
                    break;
                }
            }
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}