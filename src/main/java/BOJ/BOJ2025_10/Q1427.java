package BOJ.BOJ2025_10;

import java.util.*;
import java.io.*;

public class Q1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = br.readLine().toCharArray();

        StringBuilder sb = new StringBuilder();

        Arrays.sort(arr);
        for (int i = arr.length - 1; i >= 0; i--) {
            sb.append(arr[i]);
        }

        System.out.println(sb);
    }
}
