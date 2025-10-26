package BOJ.BOJ2025_10;
import java.util.*;
import java.io.*;
public class Q18258 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> dq = new ArrayDeque<>();
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String order = st.nextToken();

            switch (order) {
                case "push" :
                    dq.add(Integer.parseInt(st.nextToken()));
                    break;
                case "pop" :
                    if (!dq.isEmpty()) {
                        sb.append(dq.removeFirst()).append("\n");
                    } else sb.append(-1).append("\n");
                    break;
                case "size" :
                    sb.append(dq.size()).append("\n");
                    break;
                case "empty" :
                    if (!dq.isEmpty()) sb.append(0).append("\n");
                    else sb.append(1).append("\n");
                    break;
                case "front" :
                    if (!dq.isEmpty()) sb.append(dq.peekFirst()).append("\n");
                    else sb.append(-1).append("\n");
                    break;
                case "back" :
                    if (!dq.isEmpty()) sb.append(dq.peekLast()).append("\n");
                    else sb.append(-1).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}
