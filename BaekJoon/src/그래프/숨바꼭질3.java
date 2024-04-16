package 그래프;

import java.util.*;

public class 숨바꼭질3 {
    static ArrayList<Integer>[] arr;
    static Queue<Node5> q = new LinkedList<>();
    static int [] cost;
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        arr = new ArrayList[100_001];
        for(int i=0 ; i<=100_000; i++){
            arr[i] = new ArrayList<>();
        }
        for(int i=0 ; i<=100_000; i++){
            if((i+1) <=100_000) arr[i].add(i+1);
            if((i-1) >=0) arr[i].add(i-1);
//            if((i*2) <=100_000) arr[i].add(i*2);

        }
        cost = new int [100_001];
        Arrays.fill(cost, Integer.MAX_VALUE);
        int now =  n;
        int count = 0;
        q.add(new Node5(n, count));
        dijkstra(count);
        System.out.println(cost[k]);

    }
    static void dijkstra(int count){
        while(!q.isEmpty()){
            Node5 poll = q.poll();
            if(cost[poll.index] > poll.count){
                cost[poll.index] = poll.count;
                for(int i : arr[poll.index]){
                    q.add(new Node5(i, poll.count+1));
                }
                if(poll.index*2 <= 100_000 && poll.index>=0)
                q.add(new Node5(poll.index*2, poll.count ));
            }
        }

    }
}
class Node5{
    int count;
    int index;
    Node5(int index, int count){
        this.index =index;
        this.count = count;
    }
}
