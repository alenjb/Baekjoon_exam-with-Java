package 그래프;

import java.io.*;
import java.util.*;

public class 단지번호붙이기{
    static int [][] arr;
    // 오른쪽 - 아래 -> 왼쪽 - 위쪽
    static int [] dx = {1, 0, -1, 0};
    static int [] dy = {0, 1, 0, -1};
    static boolean [][] visited;
    static int countTotal = 0, count = 0;

    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        arr = new int [n][n];
        visited = new boolean [n][n];

        for(int i=0; i<n; i++){
            String line = br.readLine();
            for(int j=0; j<n ;j++){
                arr[i][j] = Integer.parseInt(line.substring(j,j+1));
            }
        }
        ArrayList<Integer> counts = new ArrayList<>();

        for(int i=0; i<n; i++){
            for(int j=0; j<n ;j++){
                if(arr[i][j] == 1 && visited[i][j]==false) {
                    count = 0;
                    countTotal++;
                    bfs(i, j);
                    counts.add(count);
                }
            }
        }

        bw.write(countTotal+"\n");
        Collections.sort(counts);
        for(int i : counts){
            bw.write(i+"\n");
        }
        bw.flush();


    }

    static void bfs(int i, int j){
        visited[i][j] = true;
        count++;
        for(int a=0; a<4; a++){
            int nowX = i + dx[a];
            int nowY = j + dy[a];

            if(rangeCheck(nowX, nowY) && arr[nowX][nowY] == 1 && visited[nowX][nowY] == false){
                bfs(nowX, nowY);
            }
        }
    }
    static boolean rangeCheck(int i, int j){
        return (i < arr[0].length && i >= 0
        && j<arr[0].length && j>=0);
    }

}