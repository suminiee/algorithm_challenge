package BOJ.BOJ2025_10;
import java.util.*;
import java.io.*;
public class Q15439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int ans = N * N - N;
        System.out.println(ans);
    }
}
