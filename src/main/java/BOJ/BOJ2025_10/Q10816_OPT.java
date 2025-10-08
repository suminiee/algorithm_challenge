package BOJ.BOJ2025_10;

import java.util.*;
import java.io.*;

public class Q10816_OPT {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb;

        int N = Integer.parseInt(br.readLine());

        HashMap<Integer, Integer> cardMap = new HashMap<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int card = Integer.parseInt(st.nextToken());

            cardMap.put(card, cardMap.getOrDefault(card, 0) +1);
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();

        for (int i = 0; i < M; i++) {
            int target = Integer.parseInt(st.nextToken());
            int count = cardMap.getOrDefault(target, 0);
            sb.append(count).append(" ");
        }

        System.out.println(sb);
    }
}
