package BOJ.BOJ2025_11;
import java.util.*;
import java.io.*;
public class Q14940 {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int n, m;
    static int[][] arr;
    static int[][] result;
    static boolean[][] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        int x= 0 , y = 0;
        arr = new int[n][m];
        visited = new boolean[n][m];
        result = new int[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if (arr[i][j] == 2) {
                    x = i;
                    y = j;
                } else if (arr[i][j] == 0) {
                    visited[i][j] = true;
                }
            }
        }
        bfs(x, y);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 1 && !visited[i][j]) {
                    sb.append("-1").append(" ");
                } else {
                    sb.append(result[i][j]).append(" ");
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);


    }
    static void bfs(int x, int y) {
        Deque<int[]> dq = new ArrayDeque<>();
        dq.add(new int[]{x, y});
        visited[x][y] = true;

        while (!dq.isEmpty()) {
            int tmp[] = dq.poll();
            for (int i = 0; i < 4; i++) {
                int nextX = tmp[0] + dx[i];
                int nextY = tmp[1] + dy[i];
                if (nextX >= 0 && nextY >= 0 && nextX < n && nextY < m) {
                    if (!visited[nextX][nextY] &&  arr[nextX][nextY] == 1) {
                        visited[nextX][nextY] = true;
                        result[nextX][nextY] = result[tmp[0]][tmp[1]] + 1;
                        dq.add(new int[] {nextX, nextY});
                    }
                }
            }
        }
    }
}
