package BOJ.BOJ2025_11;
import java.util.*;
import java.io.*;
public class Q1037 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        if (arr.length > 1) {
            Arrays.sort(arr);
            System.out.println(arr[0] * arr[N-1]);
        }
        else {
            System.out.println(arr[0] * arr[0]);
        }
    }
}
