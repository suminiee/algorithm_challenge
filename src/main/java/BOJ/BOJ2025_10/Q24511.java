package BOJ.BOJ2025_10;
import java.io.*;
import java.util.*;
public class Q24511 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());

        int[] queueStackList = new int[N];
        int[] currentList = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            queueStackList[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            currentList[i] = Integer.parseInt(st.nextToken());
        }

        int M = Integer.parseInt(br.readLine());
        int[] insertList = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            insertList[i] = Integer.parseInt(st.nextToken());
        }
        Deque<Integer> dq = new ArrayDeque<>();
        for (int i = 0; i < N; i++) {
            if (queueStackList[i] == 0) {
                dq.addFirst(currentList[i]);
            }
        }
        for (int i = 0; i < M; i++) {
            dq.add(insertList[i]);
            sb.append(dq.pollFirst()).append(" ");
        }
        System.out.println(sb);
    }
}
