import java.io.*;
import java.util.StringTokenizer;

public class b2042 {
    public static void main(String[] args) throws IOException {
        /*
                세그먼트 트리, 펜윅 트리를 사용하여 O(log N)시간에 갱신 가능
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        long[] arr = new long[n + 1];
        long[] tree = new long[4 * n];

        for (int i = 1; i <= n; i++) {
            arr[i] = Long.parseLong(br.readLine());
        }

        buildTree
    }
    public static long buildTree
}

        /*
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = new int[n+1];
        int[] dp = new int[n+1];


        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
            dp[i] = arr[i] + dp[i-1];
        }

        for (int i = 1; i <= m+k; i++) {
            st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if (a.equals("1")) {
                int gap = c - arr[b];


                바뀐 인덱스부터 구간합 배열을 갱신하는 방식은 시간적으로 비효율 적이다.
                b == 1일 때, O(N)의 시간이 걸리고 최악의 경우, O(N * (m + k)) 시간이 걸림
                백준에서 에러가 나기 때문에 개선이 필요하다.

                for (int j = b; j <= n; j++) {
                    dp[j] += gap;
                }





            } else if (a.equals("2")) {
                bw.write(dp[c] - dp[b-1] + "\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();

    }
}
  */