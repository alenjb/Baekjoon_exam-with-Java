package BFS_DFS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class 이모티콘 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int S = Integer.parseInt(br.readLine());
        Queue<int []> q = new LinkedList<>();
        boolean [] [] visited = new boolean[1001][1001]; //숫자, paste
        q.add(new int[]{1, 0, 0});

        while (!q.isEmpty()){
            int[] poll = q.poll();
            int now = poll[0];
            int count = poll[1];
            int paste = poll[2];

            if(now == S) { //BFS라서 어차피 count는 1개씩 올라가니까 S를 만나면 바로 출력
                bw.write(count+"\n");
                bw.flush();
                return;
            }

            // 만약 현재 값이 더 작으면(저번에 방문했던 것보다 더 빨리 방문할 수 있으면)
            if(!visited[now][paste]){
                visited[now][paste] = true;
                // 삭제
                if(now-1 >=1 && !visited[now-1][paste]){
                    q.add(new int[]{now-1, count+1, paste});
                }
                // 붙여넣기
                if(now+paste <=1000 && paste!=0 && !visited[now+paste][paste]){
                    q.add(new int[]{now + paste, count+1, paste});
                }
                //복사
                if(now*2 <=1000 && !visited[now][now]){
                    q.add(new int[]{now, count+1, now});
                }
            }
        }
    }
}
