package BOJ.BOJ2025_11;
import java.util.*;
import java.io.*;
public class Q11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        Person[] arr = new Person[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = new Person(i+1, Integer.parseInt(st.nextToken()));
        }
        Arrays.sort(arr, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.time - o2.time; //소요 시간 기준 오름차순 정렬
            }
        });
        int total = 0;
        int previousSum = 0;
        for (int i = 0; i < N; i++) {
            previousSum += arr[i].time;
            total += previousSum;
        }
        System.out.println(total);
    }
    static class Person {
        int index;
        int time;

        public Person(int index, int time) {
            this.index = index;
            this.time = time;
        }
    }
}
