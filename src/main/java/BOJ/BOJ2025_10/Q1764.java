package BOJ.BOJ2025_10;

import java.util.*;
import java.io.*;

public class Q1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> nameList = new HashMap<>();
        List<String> names = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            nameList.put(br.readLine(), 1);
        }
        for (int i = 0; i < M; i++) {
            String name = br.readLine();
            nameList.put(name, nameList.getOrDefault(name,0) + 1);
            if (nameList.get(name) == 2) {
                names.add(name);
            }
        }

        sb = new StringBuilder();

        Collections.sort(names);
        sb.append(names.size()).append("\n");
        for (String s : names) {
            sb.append(s).append("\n");
        }
        System.out.println(sb);
    }
}
