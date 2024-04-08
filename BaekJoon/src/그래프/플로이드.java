package 그래프;
import java.util.*;
import java.io.*;

public class 플로이드 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int [][] fw = new int[n+1][n+1];

        for(int i=1; i<n+1; i++){
            for(int j=1; j<n+1; j++){
                if(i == j) fw[i][j] = 0;
                else fw[i][j] = 10000001;
            }
        }
        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());

            if(fw[s][e] > w) fw[s][e] = w;
        }

        for(int k=1; k<n+1; k++){
            for(int s=1; s<n+1; s++){
                for(int e=1; e<n+1; e++){
                    if(fw[s][e] > fw[s][k] + fw[k][e])
                        fw[s][e] = fw[s][k] + fw[k][e];
                }
            }
        }
        for(int i=1; i<n+1; i++){
            for(int j=1; j<n+1; j++){
                if(fw[i][j] == 10000001) sb.append(0+" ");
                else sb.append(fw[i][j]+" ");
            }
            sb.append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
    }
}
