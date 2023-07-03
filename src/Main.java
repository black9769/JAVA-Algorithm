import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String alphabet = br.readLine();
        String s = alphabet.replace("c-", "c");
        s = s.replace("c=", "c");
        s = s.replace("dz=", "d");
        s = s.replace("d-", "d");
        s = s.replace("lj", "l");
        s = s.replace("nj", "n");
        s = s.replace("s=", "s");
        s = s.replace("z=", "z");

        int len = s.length();

        System.out.println(len);
    }

}
