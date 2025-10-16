package BOJ.BOJ2025_10;

import java.util.*;
import java.io.*;

public class Q2485 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] trees = new int[N];

        for (int i = 0; i < N; i++) {
            trees[i] = Integer.parseInt(br.readLine());
        }

        int gcd = 0;
        for (int i = 0; i < N-1; i++) {
            int distance = trees[i+1] - trees[i];
            gcd = getGCD(distance, gcd);
        }
        int ans = ((trees[N-1]-trees[0])/gcd)+1-(trees.length);
        System.out.println(ans);

    }
    static int getGCD(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}
