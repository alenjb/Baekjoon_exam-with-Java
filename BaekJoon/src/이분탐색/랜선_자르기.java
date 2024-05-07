package 이분탐색;

import java.io.*;
import java.util.StringTokenizer;

public class 랜선_자르기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int[] arr = new int[K];

        long max = 0;

        // 입력과 동시에 해당 랜선의 길이가 최댓값인지를 확인하고 max를 갱신
        for (int i = 0; i < K; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if(max < arr[i]) {
                max = arr[i];
            }
        }

        max++;

        long min =0;
        long mid =0;

        while(min<max){
            mid = (min + max) /2;
            long count = 0;
            for(int i=0; i<K; i++){
                count = count + arr[i]/mid;
            }

            if(count < N){
                max = mid;
            }else {
                min = mid +1;
            }
        }
        bw.write(min-1 +"");
        bw.flush();
    }
}
