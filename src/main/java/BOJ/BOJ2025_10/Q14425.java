package BOJ.BOJ2025_10;

import java.util.*;
import java.io.*;

public class Q14425 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int count = 0;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashSet<String> checkSet = new HashSet<>();
        for (int i = 0; i < N; i++) {
            checkSet.add(br.readLine());
        }

        for (int i = 0; i < M; i++) {
            String target = br.readLine();
            if (checkSet.contains(target)) {
                count++;
            }
        }


        System.out.println(count);
    }
}