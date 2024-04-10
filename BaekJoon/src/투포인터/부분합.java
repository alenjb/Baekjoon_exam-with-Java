package 투포인터;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 부분합 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());

        int [] arr = new int[N+1];
        long [] sum = new long[N+1];
        int result =100_001;

        st = new StringTokenizer(br.readLine());
        for(int i=1; i<=N; i++){
            int a = Integer.parseInt(st.nextToken());
            arr[i] = a;
            sum[i] = sum[i-1] + a;
        }

        int start_idx=1;
        int end_idx=1;

        while(end_idx<=N && start_idx<=N){
            long now_sum = sum[end_idx] - sum[start_idx-1];
            if(now_sum < S) end_idx++;
            else {
                if(end_idx - start_idx + 1 <result) result = end_idx - start_idx + 1;
                start_idx++;
            }
        }

        if(result == 100_001) result =0;
        bw.write(result+"\n");
        bw.flush();

    }
}
