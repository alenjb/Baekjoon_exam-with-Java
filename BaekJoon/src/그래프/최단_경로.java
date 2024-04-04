package 그래프;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class 최단_경로 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int totalN = Integer.parseInt(st.nextToken());
        int totalE = Integer.parseInt(st.nextToken());
        ArrayList<Node1> [] arr = new ArrayList[totalN+1];
        boolean [] visited = new boolean[totalN+1];
        int [] result = new int[totalN+1];

        st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());

        for(int i=1;i<=totalN;i++){
            result[i] = Integer.MAX_VALUE;
            if(i == start) {
                result[i] = 0;
            }
            arr[i]=new ArrayList<>();
        }

        for(int i=0; i<totalE; i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            arr[u].add(new Node1(v, w));
        }


        //다익스트라
        PriorityQueue<Node1> q = new PriorityQueue<>();
        q.offer(new Node1(start, 0));
        while (!q.isEmpty()){
            Node1 now = q.poll();
            if(visited[now.vertex]) continue;
            visited[now.vertex] = true;
            for(Node1 n : arr[now.vertex]){
                    if(n.weight + result[now.vertex] < result[n.vertex]){
                        result[n.vertex] = n.weight + result[now.vertex];
                        q.add(new Node1(n.vertex, result[n.vertex]));
                    }
            }
        }

        for(int i=1; i<=totalN; i++){
            int resultNum = result[i];
            if(resultNum == Integer.MAX_VALUE) bw.write("INF\n");
            else bw.write(resultNum+"\n");
        }
        bw.flush();
    }
}

class Node1 implements Comparable<Node1>{
    int weight;
    int vertex;
    Node1(int v, int w){
        this.weight = w;
        this.vertex = v;
    }

    @Override
    public int compareTo(Node1 node1){
        return Integer.compare(this.weight, node1.weight);
    }
}
