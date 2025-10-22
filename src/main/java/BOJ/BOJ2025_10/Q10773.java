package BOJ.BOJ2025_10;

import java.util.*;
import java.io.*;
public class Q10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> dq = new ArrayDeque<>();
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num != 0) {
                dq.addFirst(num);
            }
            else {
                dq.removeFirst();
            }
        }
        if (dq.isEmpty()) {
            System.out.println(0);
        } else {
            long sum = 0;
            while (!dq.isEmpty()) {
                sum += dq.removeFirst();
            }
            System.out.println(sum);
        }
    }
}
