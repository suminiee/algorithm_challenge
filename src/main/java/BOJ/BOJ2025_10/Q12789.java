package BOJ.BOJ2025_10;
import java.util.*;
import java.io.*;
public class Q12789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[] students = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            students[i] = Integer.parseInt(st.nextToken());
        }
        Stack<Integer> stack = new Stack<>();

        int index = 0;
        int num = 1;

        while (index < N) {
            if (students[index] == num) {
                num++;
                index++;
            } else if (!stack.empty() && stack.peek() == num) {
                stack.pop();
                num++;
            } else {
                stack.push(students[index]);
                index++;
            }
        }
        while (!stack.empty() && stack.peek() == num) {
            stack.pop();
            num++;
        }
        if (num == N + 1) {
            System.out.println("Nice");
        } else {
            System.out.println("Sad");
        }

    }
}
