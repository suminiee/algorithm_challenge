package BOJ.BOJ2025_12;
import java.io.*;
import java.util.*;
public class Q19941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        char[] arr = br.readLine().toCharArray();

        int count = 0;
        for (int i = 0; i < N; i++) {
            if (arr[i] == 'P') { // 사람
                int startIndex = Math.max(i - K, 0); // 0보다 작으면 안됨
                int endIndex = Math.min(i + K, N - 1); // 배열의 끝을 넘어가면 안됨
                for (int j = startIndex; j <= endIndex; j++) {
                    if (arr[j] == 'H') {
                        count++;
                        arr[j] = 'X'; // 햄버거가 있다면 임의의 문자로 대체
                        break;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
