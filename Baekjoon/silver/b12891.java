package Baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b12891 {

    static int[] secret = new int[4];
    static int[] window;
    static int valid = 0;



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int s = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        String[] array = new String[s];
        window = new int[p];

        //배열 선언
        st = new StringTokenizer(br.readLine(), "", true);
        for (int i = 0; i < s; i++) {
            array[i] = st.nextToken();
            System.out.print(array[i] + " ");
        }

        //비밀 조건 선언
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < secret.length; i++) {
            secret[i] = Integer.parseInt(st.nextToken());
        }
    }

    static void Add (char c){
        int index = getIndex(c);

        }

    static void Remove (char c){
        int index = getIndex(c);
    }

    static int getIndex(char c) {
        switch (c) {
            case 'A': return 0;
            case 'C': return 1;
            case 'G': return 2;
            case 'T': return 3;
            default: return -1;
        }
    }
}
