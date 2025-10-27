package BOJ.BOJ2025_10;
import java.util.*;
import java.io.*;
public class Q11866 {
    static int K = 0;
    static Deque<Integer> q = new ArrayDeque<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        for (int i = 1; i <= N; i++) {
            q.add(i);
        }
        sb.append("<");
        for (int i = 0; i < N; i++) {
            remove();
            sb.append(q.removeFirst());
            if (i < N-1) {
                sb.append(", ");
            } else {
                sb.append(">");
            }
        }
        System.out.println(sb);
    }
    static void remove() {
        for (int i = 1; i < K; i++) {
            q.add(q.removeFirst());
        }
    }
}
