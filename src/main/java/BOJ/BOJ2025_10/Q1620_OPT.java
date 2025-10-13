package BOJ.BOJ2025_10;

import java.util.*;
import java.io.*;
import java.util.regex.Pattern;

public class Q1620_OPT {
    public static void main(String[] args) throws IOException {
        StringTokenizer st;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> map = new HashMap<>();
        String[] arr = new String[N + 1];

        //기존에 푼 방식으로는 시간 초과 이중 for문 사용하지 않도록 코드 수정
        for (int i = 1; i <= N; i++) {
            String name = br.readLine();
            map.put(name, i); // HashMap에 저장 (이름 -> 번호)
            arr[i] = name;  // 배열에 저장 (번호 인덱스 -> 이름)
        }

        for (int i = 0; i < M; i++) {
            String q = br.readLine();

            if (Pattern.matches("^[a-zA-Z]*$", q)) {

                // 1. 이름으로 번호 찾기
                sb.append(map.get(q)).append("\n");
            }
            else {
                // 2. 숫자로만 이루어진 쿼리일 경우
                int num = Integer.parseInt(q);

                // 번호로 이름 찾기
                sb.append(arr[num]).append("\n");
            }
        }
        System.out.println(sb);
    }
}
