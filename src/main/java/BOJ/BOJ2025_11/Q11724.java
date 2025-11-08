package BOJ.BOJ2025_11;
import java.io.*;
import java.util.*;
public class Q11724 {
    static int N;
    static int M;
    static int[][] arr;
    static boolean[] visited;
    static int result = 0;
    static int x, y;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());//정점
        M = Integer.parseInt(st.nextToken());//간선

        arr = new int[N+1][N+1];
        visited = new boolean[N+1];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            arr[x][y] = arr[y][x] = 1;
        }
        for (int i = 1; i < N+1; i++) {
            if (!visited[i]) {
                dfs(i);
                result++;
            }
        }
        System.out.println(result);
    }
    public static void dfs(int node) {
        visited[node] = true;
        for (int i = 1; i < N+1; i++) {
            if (!visited[i] && arr[node][i] == 1) {
                dfs(i);
            }
        }
    }
}
