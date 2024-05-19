package 동적프로그래밍;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Map;
import java.util.StringTokenizer;

public class 점프_점프 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int [] arr = new int[N];
        int [] result = new int[N];
        int MAX_VALUE = Integer.MAX_VALUE;
        st = new StringTokenizer(br.readLine());

        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.fill(result, MAX_VALUE);
        result[0] = 0;

        for(int i=0; i<N; i++){
            int able = arr[i];
            int nowCount = result[i] +1;
            if(result[i] == MAX_VALUE) continue;
            //앞으로
            for(int j=i+1; j<=i+able; j++){
                if(j>=N) break;
                if(result[j] > nowCount){
                    result[j] = nowCount;
                }
            }
            //뒤로
            for(int j=i-1; j<=i-able; j--){
                if(j<0) break;
                if(result[j] > nowCount){
                    result[j] = nowCount;
                }
            }

        }
        if(result[N-1] == MAX_VALUE) bw.write(-1+"");
        else bw.write(result[N-1]+"");
        bw.flush();

    }
}
