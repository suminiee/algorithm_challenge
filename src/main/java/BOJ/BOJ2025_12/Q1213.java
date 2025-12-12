package BOJ.BOJ2025_12;
import java.util.*;
import java.io.*;
public class Q1213 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        ArrayList<Character> alphabet = new ArrayList<>();
        String name = br.readLine();

        char[] nameCharArray = name.toCharArray();
        Arrays.sort(nameCharArray);
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < name.length(); i++) {
            if (!map.containsKey(nameCharArray[i])) {
                map.put(nameCharArray[i], 1);
            } else {
                map.replace(nameCharArray[i], map.get(nameCharArray[i])+1);
            }
        }

        //문자열길이 짝수 -> 알파벳 오름차순 정렬해서 같은 문자열이 짝수개인지 확인
        if (name.length() % 2 == 0) {
            for (char key : map.keySet()) {
                if (map.get(key) % 2 != 0) {
                    System.out.println("I'm Sorry Hansoo");
                    return;
                }
                for (int i = 0; i < map.get(key) / 2; i++) {
                    alphabet.add(key);
                }
            }
            Collections.sort(alphabet);
            for (char c : alphabet) {
                sb.append(c);
            }
            Collections.reverse(alphabet);
            for (char c : alphabet) {
                sb.append(c);
            }
            System.out.println(sb);
        }
        //문자열길이 홀수 -> 알파벳 오름차순 정렬해서 같은 문자열이 짝수개이고 하나만 홀수개인지 확인
        else {
            int oddCount = 0;
            char oddStr = ' ';
            for (char key : map.keySet()) {
                if (map.get(key) % 2 == 0 && oddCount <= 1) {
                    for (int i = 0; i < map.get(key) / 2; i++) {
                        alphabet.add(key);
                    }
                } else if (map.get(key) % 2 != 0 && oddCount == 0) {
                    oddStr = key;
                    oddCount++;
                    for (int i = 0; i < map.get(key) / 2; i++) {
                        alphabet.add(key);
                    }
                } else {
                    System.out.println("I'm Sorry Hansoo");
                    return;
                }
            }
            Collections.sort(alphabet);
            for (char c : alphabet) {
                sb.append(c);
            }
            sb.append(oddStr);
            Collections.reverse(alphabet);
            for (char c : alphabet) {
                sb.append(c);
            }
            System.out.println(sb);
        }
    }
}
