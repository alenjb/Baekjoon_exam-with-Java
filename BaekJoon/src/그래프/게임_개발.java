package 그래프;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 게임_개발 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        ArrayList<ArrayList<Integer>> laterJobs = new ArrayList<>();
        for(int i=0; i<=n; i++){
            laterJobs.add(new ArrayList<>());
        }
        int [] degree = new int[n+1]; // 해당 작업의 차수 배열
        int [] time = new int[n+1]; //해당 작업 자체의 소요 시간 저장 배경
        int [] precedenceTime = new int[n+1]; //해당 작업의 이전 작업들 소요시간 배열

        for(int i=1; i<=n; i++){
            st = new StringTokenizer(br.readLine());
            time[i] = Integer.parseInt(st.nextToken());
            while(st.hasMoreTokens()){
                int precedence = Integer.parseInt(st.nextToken());
                if(precedence!= -1){
                    laterJobs.get(precedence).add(i);
                    degree[i]++;
                }else break;
            }
        }

        Queue<Integer> q = new LinkedList<>();
        for(int i=1; i<=n; i++ ){
            if(degree[i] == 0){
                q.add(i);
            }
            while (!q.isEmpty()){
                int now = q.poll();
                for(int next : laterJobs.get(now)){
                    degree[next]--;
                    precedenceTime[next] = Math.max(precedenceTime[now]+ time[now], precedenceTime[next]);
                    if(degree[next] == 0) q.add(next);
                }
            }

        }
        for(int i=1; i<=n;i++){
            bw.write((precedenceTime[i]+ time[i])+"\n");
        }
        bw.flush();
    }
}
