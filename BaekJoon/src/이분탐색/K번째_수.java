package 이분탐색;

import java.io.*;

public class K번째_수 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long N = Long.parseLong(br.readLine());
        int k = Integer.parseInt(br.readLine());

        long left = 0;
        long right = Math.min(N*N, (long)Math.pow(10,9));
        long mid = 0;
        while(left+1<right){
            mid = (left + right)/2;
            long count = 0;
            for(long i = 1; i<=N; i++){
                count += Math.min(mid / i, N);
            }
            if(count<k){
                left = mid;
            }else right = mid;
        }
        bw.write(right+"");
        bw.flush();

    }
}
