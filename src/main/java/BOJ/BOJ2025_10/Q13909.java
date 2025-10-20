package BOJ.BOJ2025_10;

import java.util.*;
import java.io.*;
public class Q13909 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        for (int i = 1; i * i <= N; i++) {
            count++;
        }
        System.out.println(count);
    }
}
