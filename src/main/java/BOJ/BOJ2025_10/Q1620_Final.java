package BOJ.BOJ2025_10;

import java.util.*;
import java.io.*;

//이게 가장 효율적인 메모리와 시간 사용하는 방법
//2중 for문 사용하려고 하지 말고 map이랑 배열을 둘 다 사용하는게 나음
public class Q1620_Final {
    public static void main(String[] args) throws IOException {
        // StringTokenizer를 사용하여 N과 M을 처리합니다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 1. HashMap: 이름으로 번호 찾기 (String Key -> Integer Value) - O(1)
        HashMap<String, Integer> nameToNumMap = new HashMap<>();

        // 2. Array: 번호로 이름 찾기 (Index Key -> String Value) - O(1)
        String[] numToNameArray = new String[N + 1];

        // N개의 포켓몬 이름 입력 및 두 자료구조에 저장
        for (int i = 1; i <= N; i++) {
            String name = br.readLine();
            nameToNumMap.put(name, i); // HashMap에 저장 (이름 -> 번호)
            numToNameArray[i] = name;  // 배열에 저장 (번호 인덱스 -> 이름)
        }

        // M개의 쿼리 처리
        for (int i = 0; i < M; i++) {
            String query = br.readLine();

            // ⭐ 최적화: 정규식 대신 첫 번째 문자가 숫자인지 문자인지만 확인합니다.
            // 쿼리(이름)는 알파벳으로 시작하며, 쿼리(번호)는 숫자로 시작한다는 점을 이용합니다.
            // 이름일 경우
            if (Character.isLetter(query.charAt(0))) {

                // 1. 이름으로 번호 찾기 (Map 사용: O(1))
                sb.append(nameToNumMap.get(query)).append("\n");
            }
            else {
                // 2. 번호일 경우
                int num = Integer.parseInt(query);

                // 번호로 이름 찾기 (배열 사용: O(1))
                sb.append(numToNameArray[num]).append("\n");
            }
        }

        System.out.print(sb);
    }
}
