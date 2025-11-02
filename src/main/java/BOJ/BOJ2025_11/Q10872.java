package BOJ.BOJ2025_11;
import java.util.*;
import java.io.*;
public class Q10872 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long ans = 1;
        for (int i = 1; i <= N; i++) {
            ans *= i;
        }
        System.out.println(ans);
    }
}
