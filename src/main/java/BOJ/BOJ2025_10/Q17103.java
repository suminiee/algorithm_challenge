package BOJ.BOJ2025_10;

import java.util.*;
import java.io.*;
public class Q17103 {
    static final int MAX = 1_000_000;
    static boolean[] isPrime;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        //에라토스테네스 체 적용
        primeArr();

        for (int i = 0; i < N; i++) {
            sb.append(countPrimeSet(Integer.parseInt(br.readLine()))).append("\n");
        }
        System.out.println(sb);
    }
    static void primeArr() {
        isPrime = new boolean[MAX + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;  // 0과 1은 소수가 아님

        for (int i = 2; i * i <= MAX; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= MAX; j += i) {
                    isPrime[j] = false;  // i의 배수를 소수에서 제외
                }
            }
        }
    }
    static int countPrimeSet(int n) {
        int count = 0;

        for (int i = 2; i <= n / 2; i++) {
            if (isPrime[i] && isPrime[n - i]) {
                count++;
            }
        }
        return count;
    }
}
