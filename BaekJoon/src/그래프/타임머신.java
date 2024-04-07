package 그래프;
import java.util.*;
import java.io.*;

public class 타임머신 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());

        Node3 [] bp = new Node3[E+1];
        long [] shortest = new long[N+1];

        shortest[1] = 0;
        for(int i=2; i<N+1; i++){
            shortest[i] = Long.MAX_VALUE;
        }

        for(int i=1; i<=E; i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());
            bp[i] = new Node3(start, end, weight);
        }
        // 입력 받기 끝

        //벨만 포드 시작
        for(int i=1; i<N; i++){
            for(int j=1; j<=E; j++){
                int start = bp[j].start;
                int end = bp[j].end;
                int weight = bp[j].weight;

                if (shortest[start]!= Long.MAX_VALUE &&
                        shortest[start] + weight < shortest[end]){
                    shortest[end] = shortest[start] + weight;
                }
            }
        }

        for(int j=1; j<=E; j++){
            int start = bp[j].start;
            int end = bp[j].end;
            int weight = bp[j].weight;

            if (shortest[start]!= Long.MAX_VALUE &&
                    shortest[start] + weight < shortest[end]){
                bw.write("-1\n");
                bw.flush();
                return;
            }
        }

        for(int k=2; k<=N; k++){
            if(shortest[k]== Long.MAX_VALUE)
                sb.append("-1\n");
            else sb.append(shortest[k]+"\n");

        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();




    }
}

class Node3{
    int start;
    int end;
    int weight;
    Node3(int start, int end, int weight){
        this.start = start;
        this.end = end;
        this.weight = weight;
    }
}
