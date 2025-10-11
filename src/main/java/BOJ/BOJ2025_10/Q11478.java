package BOJ.BOJ2025_10;

import java.util.*;
import java.io.*;

public class Q11478 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine();
        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < word.length(); i++) {
            for (int j = i+1; j <= word.length(); j++) {
                set.add(word.substring(i, j));
            }
        }

        System.out.println(set.size());
    }
}
