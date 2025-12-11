package BOJ.BOJ2025_12;

import java.util.*;
import java.io.*;

public class Q9375 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int testcase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testcase; i++) {
            int n = Integer.parseInt(br.readLine());

            HashMap<String, Integer> map = new HashMap<>();

            for (int j = 0; j < n; j++) {
                st = new StringTokenizer(br.readLine());
                String clothes = st.nextToken();
                String clothType = st.nextToken();
                map.put(clothType, map.getOrDefault(clothType, 0) + 1);
            }

            long answer = 1;
            for (String key : map.keySet()) {
                answer *= (map.get(key) + 1);
            }
            answer -= 1;

            sb.append(answer).append("\n");
        }

        System.out.print(sb);
    }
}