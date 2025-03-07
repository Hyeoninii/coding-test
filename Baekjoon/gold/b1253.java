package Baekjoon.gold;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class b1253 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        int[] arr = new int[n+1];
        for (int i = 1; i < n+1; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int start = 1;
        int end = 2;
        int k = 3;
        int count = 0;

        while (start < end) {
            if(start != k && end != k) {
                if(arr[start] + arr[end] == k) {
                    count++;
                    k++;
                } else if(arr[start] + arr[end] < k) {
                    start++;
                }
            }

        }
    }
}
