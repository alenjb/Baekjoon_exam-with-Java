package BFS_DFS;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class 뮤탈리스크 {
    static boolean [][][] visited;
    static int [] arr;
    static int result;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        result = Integer.MAX_VALUE;
        arr = new int[3];
        visited = new boolean[61][61][61];

        for(int i=0; i<N; i++){
            int now = Integer.parseInt(st.nextToken());
            arr[i] = now;
        }
        BFS(arr[0], arr[1], arr[2], 0);
        bw.write(result+"");
        bw.flush();
    }
    static void BFS(int hp1, int hp2,int hp3, int count){
        hp1 = Math.max(hp1, 0);
        hp2 = Math.max(hp2, 0);
        hp3 = Math.max(hp3, 0);
        int max = Math.max(Math.max(hp1, hp2), hp3);
        int min = Math.min(Math.min(hp1, hp2), hp3);
        int mid = hp1 + hp2 + hp3 - max - min;
        hp1 = max;
        hp2 = mid;
        hp3 = min;
        // 공격이 끝난 경우
        if(hp1 + hp2 + hp3 ==0) result = Math.min(result, count);
        if(visited[hp1][hp2][hp3]) return;
        visited[hp1][hp2][hp3] = true;
        count++;
        // 불필요한 작업 제거
        if(result<count) return;
        BFS(hp1-9, hp2-3, hp3-1, count);
        BFS(hp1-9, hp2-1, hp3-3, count);
        BFS(hp1-3, hp2-9, hp3-1, count);
        BFS(hp1-3, hp2-1, hp3-9, count);
        BFS(hp1-1, hp2-9, hp3-3, count);
        BFS(hp1-1, hp2-3, hp3-9, count);
    }
}
