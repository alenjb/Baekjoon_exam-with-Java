package 백트래킹;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 연산자_끼워넣기 {
    static int [] operator = new int [4];
    static int [] numbers;
    static int N, Max=Integer.MIN_VALUE, Min=Integer.MAX_VALUE;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        numbers = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            numbers[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<4; i++){
            operator[i] = Integer.parseInt(st.nextToken());
        }
        bfs(numbers[0], 0);
        bw.write(Max+"\n"+Min+"\n");
        bw.flush();
    }
    static void bfs(int num, int idx){
        if(idx == N-1){
            Max = Math.max(Max, num);
            Min = Math.min(Min, num);
            return;
        }

        for(int i=0; i<4; i++){
            if(operator[i]>0){
                operator[i]-=1;
                switch (i){
                    case 0:
                        bfs((num + numbers[idx+1]), idx+1);
                        break;
                    case 1:
                        bfs((num - numbers[idx+1]), idx+1);
                        break;
                    case 2:
                        bfs((num * numbers[idx+1]), idx+1);
                        break;
                    case 3:
                        bfs((num / numbers[idx+1]), idx+1);
                        break;
                }
                operator[i]+=1;
            }
        }
    }
}

