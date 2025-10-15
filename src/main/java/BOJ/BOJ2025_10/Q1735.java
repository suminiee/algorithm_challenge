package BOJ.BOJ2025_10;

import java.util.*;
import java.io.*;

public class Q1735 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        Long A1 = Long.parseLong(st.nextToken());//분자
        Long A2 = Long.parseLong(st.nextToken());//분모
        st = new StringTokenizer(br.readLine());
        Long B1 = Long.parseLong(st.nextToken());
        Long B2 = Long.parseLong(st.nextToken());

        Long a = A2 * B2;
        Long b = A1 * B2 + A2 * B1;
        Long GCD = getGCD(a, b);

        sb.append(b/GCD).append(" ").append(a/GCD);
        System.out.println(sb);
    }
    //최대공약수
    static Long getGCD(Long a2, Long b2) {
        if (b2 == 0) {
            return a2;
        }
        return getGCD(b2, a2 % b2);
    }
}
