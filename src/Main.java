import java.util.*;
import java.io.*;


public class Main
{
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] dct = new int[8];
        for(int i = 0 ; i < dct.length ; i++ ){
            dct[i] = Integer.parseInt(st.nextToken());
        }

        if(dct[0] ==1){
            boolean result = true;
            for(int i = 0 ; i< dct.length ; i++){
                if(dct[i] != i+1) result = false;
            }
            System.out.printf("%s", result ?  "ascending": "mixed");

        }
        else if(dct[0] ==8){
            boolean result = true;
            for(int i = 0 ; i< dct.length ; i++){
                if(dct[i]+i !=8) result = false;
            }
            System.out.printf("%s", result ?  "descending" :"mixed" );
        }

        else  System.out.printf("%s", "mixed");

    }
}