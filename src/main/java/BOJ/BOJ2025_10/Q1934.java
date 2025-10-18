package BOJ.BOJ2025_10;

import java.util.*;
import java.io.*;
public class Q1934 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        for (int i = 0 ; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int GCD = getGCD(A, B); //최대공약수
            int LCM = (A * B)/GCD;
            sb.append(LCM).append("\n");
        }
        System.out.println(sb);
    }
    static int getGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return getGCD(b, a%b);
    }
}
