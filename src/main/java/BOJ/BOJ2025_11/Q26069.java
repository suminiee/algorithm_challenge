package BOJ.BOJ2025_11;
import java.util.*;
import java.io.*;
public class Q26069 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        HashSet<String> rainbow = new HashSet<>();
        rainbow.add("ChongChong");
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String before = st.nextToken();
            String after = st.nextToken();
            if (rainbow.contains(before)) rainbow.add(after);
            else if (rainbow.contains(after)) rainbow.add(before);
        }
        System.out.println(rainbow.size());

    }
}
