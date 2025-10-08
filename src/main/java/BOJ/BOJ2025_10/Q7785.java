package BOJ.BOJ2025_10;

import java.io.*;
import java.util.*;

public class Q7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb;

        int N = Integer.parseInt(br.readLine());
        HashSet<String> nameList = new HashSet<>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            if (st.nextToken().equals("enter")) {
                nameList.add(name);
            } else {
                nameList.remove(name);
            }
        }

        String[] nameArr = nameList.toArray(new String[0]);
        Arrays.sort(nameArr, Collections.reverseOrder());

        sb = new StringBuilder();
        for (String name : nameArr) {
            sb.append(name).append("\n");
        }

        System.out.println(sb);
    }
}
