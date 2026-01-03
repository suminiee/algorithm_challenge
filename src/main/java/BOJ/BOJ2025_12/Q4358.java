package BOJ.BOJ2025_12;
import java.util.*;
import java.io.*;
public class Q4358 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        HashMap<String, Double> map = new HashMap<>();
        String tree;
        int cnt = 0;
        while ((tree = br.readLine()) != null) {
            cnt++;
            if (!map.containsKey(tree)) {
                map.put(tree, 1.0);
            }
            else {
                map.replace(tree, map.get(tree)+1);
            }
        }

        for (String name : map.keySet()) {
            map.replace(name, map.get(name)/cnt * 100);
        }

        List<String> keySet = new ArrayList<>(map.keySet());
        //사전순 정렬
        Collections.sort(keySet);
        for (String key : keySet) {
            sb.append(key).append(" ").append(String.format("%.4f", map.get(key))).append("\n");

        }
        System.out.println(sb);
    }
}
