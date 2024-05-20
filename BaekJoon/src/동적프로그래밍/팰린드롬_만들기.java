package 동적프로그래밍;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 팰린드롬_만들기 {
    static int [][] dp;
    static int [] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        arr = new int[N];
        dp = new int[N][N];
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for(int[] ints : dp){
            Arrays.fill(ints, -1);
        }
        bw.write(calculate(0,N-1)+"");
        bw.flush();

    }
    static int calculate(int start, int end){
        if(start > end) return 0;
        if(dp[start][end] != -1) return dp[start][end];
        if(arr[start] == arr[end]){
            dp[start][end] = calculate(start + 1, end - 1);
        }else {
            dp[start][end] = Math.min(calculate(start + 1, end) + 1, calculate(start, end - 1) + 1);
        }
        return dp[start][end];
    }
}
