package BOJ.BOJ2025_11;
import java.util.*;
import java.io.*;
public class Q25192 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
//        시간초과
//        Deque<String> dq = new ArrayDeque<>();
        int count = 0;
        //시간초과
//        for (int i = 0; i < N; i++) {
//            String nickname = br.readLine();
//            if (nickname.equals("ENTER")) {
//                count += dq.size();
//                dq.clear();
//            }
//            else if (!dq.contains(nickname)) {
//                dq.add(nickname);
//            }
//            if (i == N-1) {
//                count += dq.size();
//            }
//        }

        HashSet<String> user = new HashSet<>();
        for (int i = 0; i < N; i++) {
            String nickname = br.readLine();
            if (nickname.equals("ENTER")) {
                count += user.size();
                user.clear();
            } else {
                user.add(nickname);
            }
        }
        count += user.size();
        System.out.println(count);
    }
}
