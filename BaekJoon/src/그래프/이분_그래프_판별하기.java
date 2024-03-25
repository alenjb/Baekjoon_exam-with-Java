package 그래프;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 이분_그래프_판별하기 {
    static ArrayList<Integer>[] arr;
    static int [][]  visited;
    static boolean result = true;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int test = Integer.parseInt(st.nextToken());

        for(int i=0; i<test; i++){// 테스트 케이스 만큼 반복
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            arr = new ArrayList[n+1];
            visited = new int[2][n+1]; // 첫째줄이 방문 여부(0,1), 둘째줄이 집합(-2, 2)

            for(int a=1 ;a<=n; a++){
                arr[a] = new ArrayList<Integer>();
            }
            for(int j=0; j<e; j++){ //엣지 수만큼 반복
                st = new StringTokenizer(br.readLine());
                int start = Integer.parseInt(st.nextToken());
                int end = Integer.parseInt(st.nextToken());
                arr[start].add(end);
                arr[end].add(start);
            }

            result = true;
            visited[1][1] = 1;
            for(int k=1; k<=n; k++){
                if(result)
                    dfs(k);
                else
                    break;
            }
            if(result) {bw.write("YES\n");}else {
                bw.write("NO\n");
            }
        }

        bw.flush();


    }

    private static void dfs(int k) {
        visited[0][k] = 1;

        for(int i : arr[k]){
            if(visited[0][i]==0){
                visited[1][i] = (visited[1][k]+1) % 2;
                dfs(i);
            }else if(visited[1][i] == visited[1][k]){
                result = false;
            }
        }
    }
}
