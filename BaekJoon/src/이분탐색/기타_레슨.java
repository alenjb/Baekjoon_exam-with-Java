package 이분탐색;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.OptionalInt;
import java.util.StringTokenizer;

public class 기타_레슨 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long N = Long.parseLong(st.nextToken());
        long M = Long.parseLong(st.nextToken());
        int [] arr = new int[(int)N];
        int maxVal =0;
        long sum = 0;
        st = new StringTokenizer(br.readLine());

        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            sum += arr[i];
            if(arr[i] > maxVal) maxVal = arr[i];
        }

        long left = maxVal-1;
        long right = sum;
        long mid = 0;

        while(left+1 < right){
            int total=0;
            mid = (left + right)/2;
            int result = 0;

            for(int i = 0; i<N; i++ ){
                if(result + arr[i] >mid) {
                    result=0;
                    total++;
                }
                result =result+arr[i];
            }
            if(result!=0) total++;

            if(total<=M)  right = mid;
            else left = mid;
        }
        bw.write((left+1) + "");
        bw.flush();
    }
}
