package BOJ.BOJ2026_1;
import java.util.*;
import java.io.*;

public class Q1932 {
    public static void main(String[] args) throws IOException {
        StringTokenizer st;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] tr = new int[n][n];
        int[][] dp = new int[n][n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < i+1; j++) {
                tr[i][j] = Integer.parseInt(st.nextToken());
                if (i == n-1) {
                    dp[i][j] = tr[i][j];
                }
            }
        }

        //bottom-up
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                //아래 두개중에 누적합 더 큰애가 위에 저장되어야 함
                dp[i][j] = tr[i][j] + Math.max(dp[i+1][j], dp[i+1][j+1]);
            }
        }

        System.out.println(dp[0][0]);
    }
}
