package BOJ.BOJ2025_10;

import java.util.*;
import java.io.*;

public class Q1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        //중복 제거를 위해 Set 사용해줘야함
        HashSet<String> words = new HashSet<>();

        for (int i = 0; i < N; i++) {
            words.add(br.readLine());
        }

        //hashSet을 문자열 배열로 변경해주기 (sort 메서드 사용을 위해서)
        String[] arr = words.toArray(new String[0]);

        Arrays.sort(arr, (s1, s2) -> {
            //1. 길이 다르면 길이 기준으로 오름차순 정렬
            if (s1.length() != s2.length()) {
                return s1.length() - s2.length();
            }
            //2. 길이가 같으면 사전 순으로 정렬
            else {
                return s1.compareTo(s2); //string 비교 메서드
            }
        });

        for(String s : arr) {
            sb.append(s).append("\n");
        }

        System.out.println(sb);
    }
}
