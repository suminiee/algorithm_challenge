package BOJ.BOJ2025_10;

import java.io.*;
import java.util.*;

public class Q2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String words = br.readLine();

        String[] alphabetList = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for (String a : alphabetList) {
            words = words.replace(a, "A");
        }

        System.out.println(words.length());
    }
}
