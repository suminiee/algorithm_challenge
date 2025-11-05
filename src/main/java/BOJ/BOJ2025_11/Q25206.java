package BOJ.BOJ2025_11;
import java.util.*;
import java.io.*;
public class Q25206 {
    static int T = 20;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        double totalScore = 0; //학점의 총합
        double sum = 0; //전공과목 별 학점 * 과목평점의 합
        //전공평점 => 전공과목별 (학점 * 과목평점)의 합을 학점의 총합으로 나눈 값
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            double score = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();

            switch (grade) {
                case "A+" :
                    totalScore += score;
                    sum += 4.5 * score;
                    break;
                case "A0" :
                    totalScore += score;
                    sum += 4.0 * score;
                    break;
                case "B+" :
                    totalScore += score;
                    sum += 3.5 * score;
                    break;
                case "B0" :
                    totalScore += score;
                    sum += 3.0 * score;
                    break;
                case "C+" :
                    totalScore += score;
                    sum += 2.5 * score;
                    break;
                case "C0" :
                    totalScore += score;
                    sum += 2.0 * score;
                    break;
                case "D+" :
                    totalScore += score;
                    sum += 1.5 * score;
                    break;
                case "D0" :
                    totalScore += score;
                    sum += score;
                    break;
                case "F" :
                    totalScore += score;
                    break;
                case "P" :
                    break;
            }
        }
        System.out.println(sum/totalScore);
    }

}
