package BOJ.BOJ2025_10;

import java.util.*;
import java.io.*;

public class Q4134_OPT {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            long num = Long.parseLong(br.readLine());
            findNextPrime(num);
        }

        System.out.print(sb);
    }
    static void findNextPrime(long a) {
        long currentNum = a;

        while (true) {
            if (currentNum <= 1) {
                currentNum = 2;
                continue;
            }

            if (isPrime(currentNum)) {
                sb.append(currentNum).append("\n");
                break;
            }
            currentNum++;
        }
    }
    static boolean isPrime(long a) {
        for (long i = 2; i * i <= a; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
}
