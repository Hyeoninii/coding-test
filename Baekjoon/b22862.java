package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class b22862 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[s+1];

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= s; i++) {
            arr[i] = Integer.parseInt(st.nextToken())%2;
        }

        /*
        투 포인터를 사용하여 시작과 끝 지점에서 1의 갯수를 카운트하며 count=k를 확인해야한다.
        경우의 수
        다음 수가 0인 경우: length++, end++
        다음 수가 1인 경우:
            1이 k번 이하인 경우,  length++, end ++
            1이 k번 초과인 경우, maxLength와 length비교
         */
        int start = 1;
        int end = 1;
        int maxLength = 1;
        int oddCount = 0;

        while(end <= s) {
            if(arr[end] == 1) {
                oddCount++;
            }
            while(oddCount > k) {
                if(arr[start] == 1) {
                    oddCount--;
                }
                start++;
            }
            maxLength = Math.max(maxLength, end - start + 1 -oddCount);
            end++;
        }
        bw.write(maxLength + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
