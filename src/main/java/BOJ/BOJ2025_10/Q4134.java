package BOJ.BOJ2025_10;

import java.util.*;
import java.io.*;

//돌아가긴 하는데 시간초과 -> 재귀문 빼보자
public class Q4134 {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            Long num = Long.parseLong(br.readLine());
            nextPrime(num);
        }
        System.out.println(sb);
    }

    static void nextPrime(Long a) {
        if (isPrime(a)) {
            sb.append(a).append("\n");
        }
        else {
            nextPrime(a+1);
        }
    }
    static boolean isPrime(Long a) {
        for (int i = 2; (long) i * i <= a; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
}
