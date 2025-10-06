package BOJ.BOJ2025_10;

import java.util.*;
import java.io.*;

public class Q10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        int[] card = new int[N];
        for (int i = 0; i < N; i++) {
            card[i] = Integer.parseInt(st.nextToken());
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        int[] card2 = new int[M];
        for (int i = 0 ; i < M; i++) {
            card2[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(card);

        for (int i = 0; i < M; i++) {
            if (Arrays.binarySearch(card, card2[i]) >= 0) {
                card2[i] = 1;
            } else {
                card2[i] = 0;
            }
        }

        for (int i : card2) {
            sb.append(i).append(" ");
        }
        System.out.println(sb);
    }
}
