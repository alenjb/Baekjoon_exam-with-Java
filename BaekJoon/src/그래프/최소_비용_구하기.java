package 그래프;

import java.io.*;
import java.util.*;

public class 최소_비용_구하기 {
    static ArrayList<Node2> [] arr;
    static int [] shortest;
    static boolean [] visited;
    static PriorityQueue<Node2> q = new PriorityQueue<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int city = Integer.parseInt(st.nextToken());
        arr = new ArrayList[city+1];
        shortest = new int[city+1];
        visited = new boolean[city+1];
        for(int i=1; i<=city; i++){
            arr[i] = new ArrayList<Node2>();
        }
        Arrays.fill(shortest, Integer.MAX_VALUE);

        st = new StringTokenizer(br.readLine());
        int bus = Integer.parseInt(st.nextToken());

        for (int i = 0; i < bus; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());

            arr[start].add(new Node2(end, weight));

        }
        st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());

        shortest[start]=0;
        q.add(new Node2(start, 0));
        dijkstra();
        bw.write(shortest[end]+"");
        bw.flush();

    }

    private static void dijkstra() {
        while (!q.isEmpty()){
            Node2 poll = q.poll();
            if(!visited[poll.edge]){
                visited[poll.edge] = true;
                for(Node2 n : arr[poll.edge]){
                    if(shortest[n.edge] > shortest[poll.edge] + n.weight){
                        shortest[n.edge] = shortest[poll.edge] + n.weight;
                        q.add(new Node2(n.edge, shortest[n.edge]));
                    }
                }
            }
        }
    }
}

class Node2 implements Comparable<Node2>{
    int edge;
    int weight;
    Node2(int edge, int weight){
        this.edge = edge;
        this.weight = weight;
    }

    @Override
    public int compareTo(Node2 n) {
        return this.weight - n.weight;
    }
}