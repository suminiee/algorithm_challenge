package BOJ.BOJ2025_10;

import java.util.*;
import java.io.*;

//시간은 줄어드는데 메모리 사용량은 늘어남
public class Q10815_OPT {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        //HashSet사용 -> 숫자의 존재 여부만 빠르게 확인
        HashSet<Integer> cardSet = new HashSet<>();
        for (int i = 0; i < N; i++) {
            cardSet.add(Integer.parseInt(st.nextToken()));
        }

        //M개의 숫자가 존재하는지 확인
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < M; i++) {
            int target = Integer.parseInt(st.nextToken());

            if (cardSet.contains(target)) {
                sb.append(1).append(" ");
            } else {
                sb.append(0).append(" ");
            }
        }

        System.out.println(sb);
    }
}
