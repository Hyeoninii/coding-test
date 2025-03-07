package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class b1920 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }



    }
}
