package 집합과_맵;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class 숫자_카드_2 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int result = 0;

        Map<Integer, Integer> m = new HashMap<>();
        int N = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            int now = Integer.parseInt(st.nextToken());
            if(m.containsKey(now)) {
                m.put(now, m.get(now)+1);
            }
            else m.put(now, 1);
        }

        st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<M; i++){
            int now = Integer.parseInt(st.nextToken());
            if(m.containsKey(now)) {
                sb.append(m.get(now)+" ");
            }
            else sb.append(0+" ");
        }

        bw.write(sb.toString());
        bw.flush();


    }
}
