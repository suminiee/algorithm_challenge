package BOJ.BOJ2025_10;
import java.util.*;
import java.io.*;
public class Q4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true) {
            String s = br.readLine();
            Stack<Character> st = new Stack<>();
            if (s.equals(".")) break;

            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (ch == '(' || ch == '[') st.push(ch);
                if (ch == ')') {
                    if (st.isEmpty()) {
                        st.push(ch);
                        break;
                    }
                    if (st.peek() == '(') st.pop();
                    else break;
                } else if (ch == ']') {
                    if (st.isEmpty()) {
                        st.push(ch);
                        break;
                    }
                    if (st.peek() == '[') st.pop();
                    else break;
                }
            }
            if (st.isEmpty()) sb.append("yes").append("\n");
            else sb.append("no").append("\n");
        }
        System.out.println(sb);
    }
}
