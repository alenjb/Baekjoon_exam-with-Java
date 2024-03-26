package 그래프;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 바이러스 {
    static ArrayList<Integer> [] arr;
    static boolean [] visited;
    static int count;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int e = Integer.parseInt(st.nextToken());

        arr= new ArrayList[n+1];
        visited = new boolean[n+1];
        for(int i=0; i< arr.length; i++){
            arr[i] = new ArrayList<>();
        }
        // 엣지 입력받기
        for(int i=0; i<e; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a].add(b);
            arr[b].add(a);
        }
        dfs(1);
        bw.write(count-1 +"\n");
        bw.flush();

    }

    private static void dfs(int v) {
        if(!visited[v]){
            count++;
            visited[v] = true;
            for(int i : arr[v]){
                if(!visited[i]){
                    dfs(i);
                }
            }
        }
    }
}
