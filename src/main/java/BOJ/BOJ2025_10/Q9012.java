package BOJ.BOJ2025_10;

import java.util.*;
import java.io.*;
public class Q9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++) {
            String S = br.readLine();
            Stack<Character> stack = new Stack<>();

            for(int j = 0; j < S.length(); j++) {
                if(S.charAt(j) == '(') {
                    stack.push(S.charAt(j));
                }else {
                    if(stack.empty()) {
                        stack.push(S.charAt(j));
                        break;
                    }else {
                        stack.pop();
                    }
                }
            }
            if(stack.empty()) sb.append("YES").append("\n");
            else sb.append("NO").append("\n");
        }
        System.out.println(sb);
    }
}
