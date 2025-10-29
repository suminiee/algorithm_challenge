package BOJ.BOJ2025_10;
import java.util.*;
import java.io.*;

//저장해야 하는 값이 두개라면(index, value) 클래스 생성해서 그 클래스틀 타입으로 하는 deque 만들어서 사용해보기!
public class Q2346 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        Deque<Balloon> dq = new ArrayDeque<>();

        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            dq.add(new Balloon(i, Integer.parseInt(st.nextToken())));
        }

        while (!dq.isEmpty()) {
            sb.append(dq.peekFirst().idx).append(" ");
            int next = dq.removeFirst().val;
            if (dq.isEmpty()) break;

            if (next > 0) {
                for (int i = 0; i < next-1; i++) {
                    dq.addLast(dq.removeFirst());
                }
            }
            else {
                for (int i = 0; i < Math.abs(next); i++) {
                    dq.addFirst(dq.removeLast());
                }
            }
        }
        System.out.println(sb);
    }
    static class Balloon {
        int idx, val;

        public Balloon(int idx, int val) {
            this.idx = idx;
            this.val = val;
        }
    }
}
