package BOJ.BOJ2026_1;
import java.util.*;
import java.io.*;

public class Q6588 {
    static boolean[] prime;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int max = 1000000;
        prime = new boolean[1000001];
        Arrays.fill(prime, true);
        checkPrime(max);
        while(true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;
            for (int i = 1; i < n; i++) {
                if (prime[i]) {
                    if (prime[n-i]) {
                        sb.append(n).append(" = ").append(i).append(" + ").append(n-i).append("\n");
                        break;
                    }

                }
                else if (i == n-1) {
                    sb.append("Goldbach's conjecture is wrong.").append("\n");
                    break;
                }
                else {
                    continue;
                }
            }
        }
        System.out.println(sb);
    }

    static void checkPrime(int max) {
        prime[0] = prime[1] = false;
        for (int i = 2; i <= Math.sqrt(max); i++) {
            if (prime[i]) { // i가 소수일 경우
                // i의 배수는 모두 소수가 아니므로 false로 설정
                for (int j = i * i; j <= max; j += i) {
                    prime[j] = false;
                }
            }
        }
    }
}
