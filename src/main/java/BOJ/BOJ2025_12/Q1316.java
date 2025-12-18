package BOJ.BOJ2025_12;
import java.util.*;
import java.io.*;
public class Q1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        HashSet<Character> set = new HashSet<>();
        int result = 0;
        int check = 0;
        char before;
        for (int i = 0; i < N; i++) {
            String word = br.readLine();
            for (int j = 0; j < word.length(); j++) {
                char alpabet = word.charAt(j);

                if (!set.contains(alpabet)) {
                    set.add(alpabet);
                }
                else if (j > 0 && alpabet == word.charAt(j-1)) {
                    continue;
                }
                else {
                    set.clear();
                    check = 1;
                    break;
                }
            }
            set.clear();
            if (check == 0) {
                result++;
            }
            check = 0;
        }
        System.out.println(result);
    }
}
