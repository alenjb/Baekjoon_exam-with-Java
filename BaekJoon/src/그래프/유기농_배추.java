package 그래프;
import java.io.*;
import java.util.*;

public class 유기농_배추 {
    static int[] count;
    static int [][]arr;
    static boolean [][]visited;
    static int [] dx = {1,0,-1, 0};
    static int [] dy = {0,1,0, -1};


    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int T = Integer.parseInt(st.nextToken());
        count = new int[T+1];

        for(int i=1; i<=T; i++){
            st = new StringTokenizer(br.readLine());
            int M = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            arr = new int[N+1][M+1];
            visited = new boolean[N+1][M+1];
            for(int j=0; j<K; j++){
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                arr[y][x] = 1;
            }
            for(int j=0; j<N; j++){
                for(int k=0; k<M; k++){
                    if(arr[j][k] == 1 && !visited[j][k]){
                        dfs(j, k);
                        count[i] ++;
                    }
                }
            }
        }
        for(int m = 1; m<=T; m++){
            bw.write(count[m]+"\n");
        }
        bw.flush();
    }
    public static void dfs(int y, int x){
        visited[y][x] = true;
        for(int i=0; i<4; i++){
            int xx = x+dx[i];
            int yy = y+dy[i];

            if(xx>=0 && yy >=0&& arr[yy][xx] == 1 && !visited[yy][xx]){
                dfs(yy, xx);
            }
        }
    }
}
