import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int cnt = 0;
        int floor = 0;
        while (cnt < X) {
            floor++;
            cnt = floor * (floor + 1) / 2;
        }
        int room = X - (floor - 1) * floor / 2;

        if (floor % 2 == 0) {
            System.out.printf("%d/%d", room, floor - room + 1);
            System.out.println();
        } else {
            System.out.printf("%d/%d", floor - room + 1, room);
            System.out.println();
        }

    }

}
