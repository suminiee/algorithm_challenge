package BOJ.BOJ2025_10;

import java.util.*;
import java.io.*;

public class Q10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb;

        int N = Integer.parseInt(br.readLine());
        int[] myCard = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            myCard[i] = Integer.parseInt(st.nextToken());
        }

        int M = Integer.parseInt(br.readLine());
        int[] count = new int[M];
        Arrays.fill(count, 0);

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            int card = Integer.parseInt(st.nextToken());
            for (int c : myCard) {
                if (card == c) {
                    count[i]++;
                }
            }
        }

        sb = new StringBuilder();
        for (int result : count) {
            sb.append(result).append(" ");
        }
        System.out.println(sb);

    }
}
