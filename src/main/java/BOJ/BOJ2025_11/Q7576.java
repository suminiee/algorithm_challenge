package BOJ.BOJ2025_11;
import java.io.*;
import java.util.*;
public class Q7576 {
    static boolean[][] result;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static Deque<int[]> dq = new ArrayDeque<>();
    static int N, M;
    static int[][] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        arr = new int[N][M];
        int day = 0;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                //익은 토마토
                if (arr[i][j] == 1) {
                    dq.add(new int[]{i, j});
                }
            }
        }

        bfs();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (arr[i][j] == 0) {
                    System.out.println(-1);
                    return;
                }
                day = Math.max(day, arr[i][j]);
            }
        }
        System.out.println(day-1);
    }
    static void bfs() {
        while(!dq.isEmpty()) {
            int[] current = dq.poll();
            int x = current[0];
            int y = current[1];

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && nx < N && ny >= 0 && ny < M) {
                    if (arr[nx][ny] == 0) {
                        arr[nx][ny] = arr[x][y] + 1;
                        dq.add(new int[]{nx, ny});
                    }
                }
            }
        }
    }
}
