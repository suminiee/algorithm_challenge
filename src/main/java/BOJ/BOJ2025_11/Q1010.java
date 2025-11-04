package BOJ.BOJ2025_11;
import java.util.*;
import java.io.*;
public class Q1010 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        while (N-->0) {
            st = new StringTokenizer(br.readLine());
            int west = Integer.parseInt(st.nextToken());
            int east = Integer.parseInt(st.nextToken());
            sb.append(bridgeNum(east, west)).append("\n");
        }
        System.out.println(sb);
    }
    static long bridgeNum (int n, int r) {
//        오버플로우 발생
//        long t = 1;
//        long b = 1;
//        for (int i = 0; i < w; i++) {
//            t *= (e-i);
//            b *= (i+1);
//        }
//        return t/b;
        if (r > n - r) {
            r = n - r;
        }

        long result = 1;
        for (int i = 1; i <= r; i++) {
            result = result * (n - i + 1);
            result = result / i;
        }
        return result;
    }
}
