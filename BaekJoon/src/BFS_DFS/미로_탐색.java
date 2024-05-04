package BFS_DFS;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 미로_탐색 {
    static int [][] arr;
    static boolean [][] visited;
    static int count = Integer.MAX_VALUE;
    static int N, M;
    static Queue<Node> q = new LinkedList<>();
    static int [] dx = {1, 0, -1, 0};
    static  int [] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());


        
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        
        arr = new int[N+1][M+1];
        visited = new boolean[N+1][M+1];

        for(int i=0; i<N; i++){
            String line = br.readLine();
            for(int j=0; j<M; j++){
                arr[i][j] = Integer.parseInt(line.substring(j, j+1));
            }
        }
        BFS(0, 0, 1);
        bw.write(count+"\n");
        bw.flush();
    }

    private static void BFS(int y, int x, int now) {
        if(y== N-1 && x==M-1) count = Math.min(now, count);
        else {
            if(!visited[y][x]){
                visited[y][x]=true;
                for(int i=0; i<4; i++){
                    int ny = y + dy[i];
                    int nx = x + dx[i];
                    if( ny>=0 && nx>=0 && ny<N && nx<M&&
                            arr[ny][nx] == 1 && !visited[ny][nx]) {
                        q.add(new Node(ny,nx,now+1));}
                }
                while (!q.isEmpty()){
                    Node poll = q.poll();
                    BFS(poll.y, poll.x, poll.now);
                }

            }

        }
    }
}
class Node{
    int y;
    int x;
    int now;
    public Node(int y, int x, int now){
        this.y = y;
        this.x = x;
        this.now = now;
    }
}
