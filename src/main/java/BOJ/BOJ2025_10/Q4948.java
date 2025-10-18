package BOJ.BOJ2025_10;

import java.util.*;
import java.io.*;
public class Q4948 {
    static StringBuilder sb = new StringBuilder();
    static final int MAX_RANGE = 246913;
    static boolean[] isNotPrime;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        isPrime();
        while (true) {
            int N = Integer.parseInt(br.readLine());
            if (N == 0) break;
            int count = 0;
            for (int i = N + 1; i <= 2 * N; i++) {
               if (!isNotPrime[i]) count++;
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb);
    }
    static void isPrime() {
        isNotPrime = new boolean[MAX_RANGE];
        //0이랑 1은 소수가 아님
        if (MAX_RANGE > 0) isNotPrime[0] = true;
        if (MAX_RANGE > 1) isNotPrime[1] = true;

        for (int i = 2; i * i < MAX_RANGE; i++) {
            if (!isNotPrime[i]) {
                //i의 모든 배수를 지움 (i가 소수가 아니라면 그 배수들은 소수가 아님
                //i * i부터 시작하는 이유는 그 전의 배수는 이미 더 작은 소수의 배수로 지워졌음.
                for (int j = i * i; j < MAX_RANGE; j += i) {
                    isNotPrime[j] = true;
                }
            }
        }
    }
}
