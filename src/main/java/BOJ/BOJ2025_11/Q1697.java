package BOJ.BOJ2025_11;
import java.util.*;
import java.io.*;
public class Q1697 {
    static int N, K;
    static boolean[] visited;
    static int result = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        visited = new boolean[100001];

        bfs(N, K);
        System.out.println(result);
    }
    static void bfs(int start, int target) {
        Deque<int[]> dq = new ArrayDeque<>();
        visited[start] = true;
        dq.add(new int[] {start, 0});

        while (!dq.isEmpty()) {
            int[] curr = dq.poll();
            int pos = curr[0];
            int time = curr[1];

            if (pos == target) {
                result = time;
                return;
            }

            int[] dx = {pos+1, pos-1, pos*2};
            for (int d : dx) {
                if (d >= 0 && d < 100001 && !visited[d]) {
                    dq.add(new int[] {d, time+1});
                    visited[d] = true;
                }
            }
        }
    }
}
