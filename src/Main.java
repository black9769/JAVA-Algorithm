import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if (year %4 ==0){
            if (year %100 !=0 || year % 400 ==0) System.out.printf("1");
            else System.out.printf("0");
        }
        else System.out.printf("0");

    }
}
