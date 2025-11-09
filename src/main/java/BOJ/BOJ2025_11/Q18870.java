package BOJ.BOJ2025_11;
import java.util.*;
import java.io.*;
public class Q18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int[] sortedArr = new int[N];
        HashMap<Integer, Integer> map = new HashMap<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = sortedArr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(sortedArr);

        int rank = 0;
        for (int value : sortedArr) {
            if (!map.containsKey(value)) {
                map.put(value, rank);
                rank++;
            }
        }

        for (int value : arr) {
            sb.append(map.get(value)).append(" ");
        }
        System.out.println(sb);
    }
}
