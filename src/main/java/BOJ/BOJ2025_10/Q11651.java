package BOJ.BOJ2025_10;

import java.util.*;
import java.io.*;

public class Q11651 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb;

        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        // y좌표가 증가하는 순, y좌표가 같다면 x 좌표가 증가하는 순서로 정렬
        Arrays.sort(arr, (c1, c2) -> {
            if (c1[1] != c2[1]) {
                return c1[1] - c2[1];
            } else {
                return c1[0] - c2[0];
            }
        });


        sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");
        }
        System.out.println(sb);

    }
}
