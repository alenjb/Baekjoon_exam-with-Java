package 이분탐색;

import java.io.*;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class 예산 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int N = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int result=0;

        // 우선순위 큐에 다 넣기
        for(int i =0; i<N ; i++){
            pq.add(Integer.parseInt(st.nextToken()));
        }
        st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());

        // 하나씩 빼면서 그 값만큼 곱해도 줄 수 있으면 빼기
        while (!pq.isEmpty()){
            int poll = pq.poll();
            // 줄 수 없으면 나머지  / (큐의 크기+1)
            if(poll * (pq.size()+1) > M)  {
                result = M / (pq.size()+1);
                break;
            }else {
                M -= poll;
                result =poll;
            }
        }

        bw.write(result+"\n");
        bw.flush();

    }
}
