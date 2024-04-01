package 그래프;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 줄_세우기 {
    public static void main(String[] args) throws Exception{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        ArrayList<ArrayList<Integer>> arr = new ArrayList<>(); // 인접 리스트
        for(int i=0; i<=n ;i++){
            arr.add(new ArrayList<>());
        }
        int [] degree = new int[n+1];  // 진입 차수 배열

        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(st.nextToken());
            int E = Integer.parseInt(st.nextToken());
            arr.get(S).add(E);
            degree[E]++;
        }

        //위상 정렬하기
        Queue<Integer> q = new LinkedList<>();
        for(int i=1; i<=n; i++){
            if(degree[i] == 0){
                q.offer(i);
            }
        }

        while (!q.isEmpty()){
            int now = q.poll();
            bw.write(now+" ");
            for(int next : arr.get(now)){
                degree[next]--;
                if(degree[next]==0){
                    q.offer(next);
                }
            }
        }
        bw.flush();
    }
}
