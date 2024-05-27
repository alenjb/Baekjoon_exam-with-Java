package 브루트포스;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ATM {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int [] arr = new int[N];
        int [] result = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i=0;i <N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        result[0] = arr[0];
        long count = result[0];
        for(int i=1; i<N; i++){
            result[i] = result[i-1] + arr[i];
            count += result[i];
        }
        bw.write(count+"");
        bw.flush();
    }
}
