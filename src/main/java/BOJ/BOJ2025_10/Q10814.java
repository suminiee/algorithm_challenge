package BOJ.BOJ2025_10;

import java.util.*;
import java.io.*;

public class Q10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        String[][] arr = new String[N][2];

        for (int i = 0; i < N; i++) {
            String[] s = br.readLine().split(" ");
            arr[i][0] = s[0];
            arr[i][1] = s[1];
        }

        Arrays.sort(arr, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                if (o1[0] == o2[0])  {
                    return 1;
                } else {
                    return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
                }
            }
        });

        for (int i = 0; i < N; i++) {
            sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");
        }

        System.out.println(sb);

    }
}
