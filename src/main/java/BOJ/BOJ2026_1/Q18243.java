package BOJ.BOJ2026_1;
import java.util.*;
import java.io.*;
public class Q18243 {
    static int  INF = 1_000_000_000;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); //사람 수 = 노드 개수
        int K = Integer.parseInt(st.nextToken()); //친구 관계 수 = 간선 개수

        int[][] graph = new int[N+1][N+1];
        for (int i = 1; i < N+1; i++) {
            Arrays.fill(graph[i], INF);
            graph[i][i] = 0; //자기 자신까지의 거리는 0임
        }

        for (int i = 1; i < K+1; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph[u][v] = 1;
            graph[v][u] = 1;
        }

        floyd(graph, N);
        check(graph, N);
    }

    static void floyd(int[][] graph, int N) {
        for (int k = 1; k < N+1; k++) {
            for (int i = 1; i < N+1; i++) {
                for (int j = 1; j < N+1; j++) {
                    if (graph[i][j] > graph[i][k] + graph[k][j]) {
                        graph[i][j] = graph[i][k] + graph[k][j];
                    }
                }
            }
        }
    }

    static void check(int[][] graph, int N) {
        boolean smallWorld = true;
        for (int i = 1; i < N+1; i++) {
            for (int j = 1; j < N+1; j++) {
                if (graph[i][j] > 6 || graph[i][j] == INF) { //6보다 더 거리가 멀거나 연결되지 않은경우
                    smallWorld = false;
                    System.out.println("Big World!");
                    break;
                }
            }
            if (!smallWorld) {
                break;
            }
        }
        if (smallWorld) {
            System.out.println("Small World!");
        }
    }
}
