package BOJ.BOJ2025_10;

import java.util.*;
import java.io.*;
import java.util.regex.Pattern;

public class Q1620 {
    public static void main(String[] args) throws IOException {
        StringTokenizer st;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            map.put(br.readLine(), i+1);
        }

        sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            String word = br.readLine();
            if (Pattern.matches("^[a-zA-Z]*$", word)) {
                sb.append(map.get(word)).append("\n");
            }
            else {
                int value = Integer.parseInt(word);
                for (Map.Entry<String, Integer> entry : map.entrySet()) {
                    if (entry.getValue() == value) {
                        sb.append(entry.getKey()).append("\n");
                        break;
                    }
                }
            }
        }
        System.out.println(sb);
    }
}
