package 이분탐색;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 나무_자르기 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long N = Long.parseLong(st.nextToken());
        long M = Long.parseLong(st.nextToken());

        long [] arr = new long[(int) N];

        st = new StringTokenizer(br.readLine());
        long max = 0;
        for(int i=0; i<N; i++){
            long num = Long.parseLong(st.nextToken());
            arr[i] = num;
            if(max < num) max = num;
        }

        // 이분 탐색
        long left = 0;
        long right = max;
        long mid;
        while(left+1<right){
            mid = (left + right) /2;

            long count = 0;
            for(int i=0; i<N; i++){
                if(arr[i] > mid){
                    count = count + arr[i] - mid;
                }
            }
            // 절단 가능
            if(count >= M){
                left = mid;
            }

            //절단 실패
            else {
                right = mid;
            }
        }

        bw.write(left+"");
        bw.flush();


    }
}
