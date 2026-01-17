package BOJ.BOJ2026_1;
import java.util.*;
import java.io.*;
public class Q1699 {
    static int count = 0;
    static int n = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        dp(n);
        System.out.println(count);
    }
    static void dp (int num) {
        if (n < 4) {
            count += n;
        } else {
            int v = (int) Math.sqrt((double) n);
            n -= v * v;
            count++;
            dp(n);
        }
    }
}
