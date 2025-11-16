package BOJ.BOJ2025_11;
import java.util.*;
import java.io.*;
public class Q17219 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());//저장된 사이트 주소의 수
        int M = Integer.parseInt(st.nextToken());//비밀번호를 찾으려는 사이트 주소의 수

        HashMap<String, String> password = new HashMap<>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            password.put(st.nextToken(), st.nextToken());
        }
        for (int i = 0; i < M; i++) {
            sb.append(password.get(br.readLine())).append("\n");
        }
        System.out.println(sb);
    }
}
