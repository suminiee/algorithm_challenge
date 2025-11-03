package BOJ.BOJ2025_11;
import java.util.*;
import java.io.*;
public class Q11050 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int top = 1;
        int bot = 1;
        for (int i = 0; i < M; i++) {
             top *= (N-i);
             bot *= (i+1);
        }
        System.out.println(top/bot);
    }
}