package BFS_DFS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class 토마토 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Queue<int[]> q = new LinkedList<>();

        int [] dx = {1, 0, -1, 0};
        int [] dy = {0, 1, 0, -1};

        int[][] arr;
        boolean[][] visited;
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        arr = new int[N + 1][M + 1];
        visited = new boolean[N + 1][M + 1];
        int count = 0;

        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= M; j++) {
                int num = Integer.parseInt(st.nextToken());
                if(num == 1) q.add(new int[] {i,j, 1});
                arr[i][j] = num;
            }
        }

            while (!q.isEmpty()){
                int[] poll = q.poll();
                int x = poll[1];
                int y = poll[0];
                int nowCount = poll[2];

                if(!visited[y][x] && arr[y][x] !=-1){
                    visited[y][x] = true;
                    arr[y][x] = nowCount; // 1번째로 방문하면 1
                    count = nowCount-1;
                    for(int k=0; k<4; k++){
                        int nowX = x + dx[k];
                        int nowY = y + dy[k];
                        if(nowX >=1 && nowX<=M && nowY>=1 && nowY<=N
                        && arr[nowY][nowX] !=-1 && !visited[nowY][nowX]){
                            arr[nowY][nowX] = nowCount+1;
                            q.add(new int [] {nowY, nowX , nowCount+1});
                        }
                    }
                }
            }
            // 못도달한 토마토가 있으면 -1 반환
            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= M; j++) {
                    if(arr[i][j] !=-1 && !visited[i][j]) {
                        bw.write("-1"+"\n");
                        bw.flush();
                        return;
                    }
                }
            }


            bw.write(count+"\n");
            bw.flush();

        }
}
