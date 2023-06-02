import java.util.*;
import java.io.*;


public class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int result = 2;

        for(int i = 0; i <N; i++){
            result  = (int) (result + Math.pow(2, i));
        }

        System.out.printf("%d" , result * result);



    }
}