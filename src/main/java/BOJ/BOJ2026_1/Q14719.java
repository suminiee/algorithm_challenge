package BOJ.BOJ2026_1;
import java.util.*;
import java.io.*;
public class Q14719 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int H = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());

        int[] height = new int[W];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < W; i++) {
            height[i] = Integer.parseInt(st.nextToken());
        }

        int totalRainwater = 0;
        // 양 끝은 물이 고일 수 없으므로 제외
        for (int i = 1; i < W - 1; i++) {
            int leftMax = 0;
            int rightMax = 0;

            //현재 위치에서 왼쪽으로 가장 높은 블록
            for (int j = 0; j <= i; j++) {
                leftMax = Math.max(leftMax, height[j]);
            }

            //현재 위치에서 오른쪽으로 가장 높은 블록
            for (int j = i; j < W; j++) {
                rightMax = Math.max(rightMax, height[j]);
            }

            //두 높은 블록 중 낮은 쪽이 빗물의 높이를 결정
            int minHeight = Math.min(leftMax, rightMax);

            //결정된 높이에서 현재 블록의 높이를 빼면 고이는 양
            if (minHeight > height[i]) {
                totalRainwater += (minHeight - height[i]);
            }
        }

        System.out.println(totalRainwater);


    }
}
