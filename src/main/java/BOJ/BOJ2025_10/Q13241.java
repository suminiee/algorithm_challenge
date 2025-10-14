package BOJ.BOJ2025_10;

import java.util.*;
import java.io.*;

//유클리드 호제법 -> 최대공약수 : 두 수 A와 B의 최대공약수는 B와 A를 B로 나눈 나머지 R의 최대공약수와 같다.
//즉, 큰 수를 작은 수로 계속 나누고 그 나머지와 작은 수를 가지고 다시 나누는 과정을 반복하는 것. 나머지가 0이 되는 순간 그때의 나누는 수가 바로 최대공약수가 된다.
//A X B = 최대공약수 X 최소공배수
public class Q13241 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Long A = Long.parseLong(st.nextToken());
        Long B = Long.parseLong(st.nextToken());

        Long GCD = getGCD(A, B);
        Long LCM = (A * B) / GCD;
        System.out.println(LCM);

    }

    static Long getGCD(Long a, Long b) {
        if (b == 0) {
            return a;
        }
        return getGCD(b, a % b);
    }
}
