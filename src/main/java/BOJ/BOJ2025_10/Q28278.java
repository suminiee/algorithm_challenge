package BOJ.BOJ2025_10;
import java.util.*;
import java.io.*;
public class Q28278 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        Deque<Integer> dq = new ArrayDeque<>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int stackCase = Integer.parseInt(st.nextToken());
            switch (stackCase) {
                case 1:
                    dq.addFirst(Integer.parseInt(st.nextToken()));
                    break;
                case 2:
                    if (dq.isEmpty()) sb.append(-1).append("\n");
                    else {
                        sb.append(dq.removeFirst()).append("\n");
                    }
                    break;
                case 3:
                    sb.append(dq.size()).append("\n");
                    break;
                case 4:
                    if (dq.isEmpty()) sb.append(1).append("\n");
                    else {
                        sb.append(0).append("\n");
                    }
                    break;
                case 5:
                    if (!dq.isEmpty()) sb.append(dq.peekFirst()).append("\n");
                    else sb.append(-1).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}
