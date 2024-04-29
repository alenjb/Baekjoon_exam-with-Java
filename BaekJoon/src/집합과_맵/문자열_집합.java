package 집합과_맵;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class 문자열_집합 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        Map<String, Integer> m = new HashMap<>();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int count = 0;

        for(int i=0; i<N; i++){
            m.put(br.readLine(), 0);
        }

        for(int i=0; i<M;i++){
            String line = br.readLine();
            if(m.containsKey(line)) count++;
        }

        bw.write(count+"");
        bw.newLine();
        bw.flush();

    }
}
