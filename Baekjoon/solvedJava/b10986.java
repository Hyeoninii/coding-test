package Baekjoon.solvedJava;

import java.io.*;
import java.util.StringTokenizer;

//타입 체크 int타입은 에러, long타입은 통과
public class b10986 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());   //배열 길이
        int divisor = Integer.parseInt(st.nextToken()); //나누는 수

        long prefixSum = 0;  //구간 합은 저장할 필요 x이므로 값으로만 지정
        long[] remainders = new long[n+1];    //나머지 배열
        long[] C = new long[divisor];


        st = new StringTokenizer(br.readLine());


        for (int i = 1; i <= n; i++) {
            prefixSum += Integer.parseInt(st.nextToken());
            remainders[i] = (prefixSum % divisor + divisor) % divisor;
            C[(int)remainders[i]]++;
        }
        long result = C[0];
        for (int i = 0; i < divisor; i++) {
            result += (C[i] * (C[i] - 1) / 2);
        }

        bw.write(String.valueOf(result));
        bw.flush();








    }
}
