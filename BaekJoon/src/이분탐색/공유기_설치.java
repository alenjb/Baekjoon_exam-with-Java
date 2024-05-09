package 이분탐색;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 공유기_설치 {
    static long [] arr;
    static long N, M;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Long.parseLong(st.nextToken());
        M = Long.parseLong(st.nextToken());
        arr = new long[(int) N];

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            arr[i] = Long.parseLong(st.nextToken());
        }

        Arrays.sort(arr);

        long left = 1;
        long right = arr[(int)(N-1)] - arr[0] +1;
        long answer = 0;
        long mid = 0;
        while(left < right){
            mid = (left + right) / 2;
            int result = check(mid);
            if(result >= M){
                answer = mid;
                left = mid +1;
            }else right = mid;
        }

        bw.write(answer+"");
        bw.flush();




    }

    private static int check(long mid) {
        long prev = arr[0];
        int count = 1;
        for(int i=0; i<N; i++){
            long distance = arr[i] - prev;
            if(distance >= mid){
                count ++;
                prev = arr[i];
            }
        }
        return count;
    }

}
