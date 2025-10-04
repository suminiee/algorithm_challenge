package BOJ.BOJ2025_10;

import java.util.*;
import java.io.*;
public class Q11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb;
        int N = Integer.parseInt(br.readLine()); // 좌표 개수
        int[][] coord = new int[N][2];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            coord[i][0] = Integer.parseInt(st.nextToken());
            coord[i][1] = Integer.parseInt(st.nextToken());
        }

        // + 정렬 로직 수정
        Arrays.sort(coord, (c1, c2) -> {
            //c1 : 첫 번째 좌표 배열
            //c2 : 두 번쨰 좌표 배열

            //x 좌표가 다르면 x 좌표를 기준으로 정렬 (오름차순 : C1[0] - c2[0])
            if (c1[0] != c2[0]) {
                return c1[0] - c2[0];
            }
            // x 좌표가 같으면 y 좌표 기준으로 정렬
            else  {
                return c1[1] - c2[1];
            }
        });

        sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(coord[i][0]).append(" ").append(coord[i][1]).append("\n");
        }
        System.out.println(sb);
    }
}
