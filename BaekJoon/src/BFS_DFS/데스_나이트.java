package BFS_DFS;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 데스_나이트 {
    static int [] dx = {-2, -2, 0, 0, 2, 2};
    static int [] dy = {-1, 1, -2, 2, -1, 1};
    static int [][] chess;
    static boolean [][] visited;
    static int N, r1, r2, c1, c2, minCount;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        chess = new int[N][N];
        visited = new boolean[N][N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        minCount = Integer.MAX_VALUE;
        r1 = Integer.parseInt(st.nextToken());
        c1 = Integer.parseInt(st.nextToken());
        r2 = Integer.parseInt(st.nextToken());
        c2 = Integer.parseInt(st.nextToken());

        BFS();
    }

    static void BFS(){
        Queue<int []> q= new LinkedList<>();
        q.add(new int[] {r1,c1,0});
        while (!q.isEmpty()){
            int[] poll = q.poll();
            int x = poll[0];
            int y = poll[1];
            int count = poll[2];
            if(!visited[y][x]){// 비어있지 않으면
                visited[y][x] = true;
                if(y == c2 && x==r2){
                    System.out.println(count);
                    return;
                }
                count++;
                for(int i=0; i< dx.length; i++){
                    if(x+dx[i]>=0 && x+dx[i]<N && y+dy[i]>=0 && y+dy[i]<N){
                        q.add(new int [] {x+dx[i], y+dy[i], count});
                    }
                }
            }
        }
        System.out.println(-1);
    }
}
