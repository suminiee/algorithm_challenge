package BOJ.BOJ2025_11;
import java.util.*;
import java.io.*;
public class Q24723 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int ans = 1;
        for (int i = 0; i < N; i++) {
            ans *= 2;
        }
        System.out.println(ans);
    }
}
