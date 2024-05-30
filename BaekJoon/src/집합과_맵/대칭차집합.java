package 집합과_맵;

import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class 대칭차집합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        Set<Integer> sa = new HashSet<>();
        Set<Integer> sb = new HashSet<>();
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<a; i++){
            int now = Integer.parseInt(st.nextToken());
            sa.add(now);
        }
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<b; i++){
            int now = Integer.parseInt(st.nextToken());
            sb.add(now);
        }
        int count = 0;
        for(int num : sa){
            if(!sb.contains(num)) count++;
        }
        for(int num : sb){
            if(!sa.contains(num)) count++;
        }


        bw.write(count+"");
        bw.flush();
    }
}
