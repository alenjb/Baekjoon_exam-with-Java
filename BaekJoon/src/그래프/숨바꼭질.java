package 그래프;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 숨바꼭질 {
    static boolean [] visited = new boolean [100001];
    static int k, count;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        k = sc.nextInt();
        count = 100001;
        Node node = new Node(n, 0);
        bfs(node);

        System.out.println(count);

    }

    private static void bfs(Node node) {
        visited[node.num] = true;
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        while(!q.isEmpty()){
            Node poll = q.poll();
            ArrayList<Node> nodes = new ArrayList<>();
            nodes.add(new Node(poll.num-1, poll.depth+1));
            nodes.add(new Node(poll.num+1, poll.depth+1));
            nodes.add(new Node(poll.num*2, poll.depth+1));

            for (Node node1 : nodes) {
                if(inRange(node1.num) && !visited[node1.num]){
                    if(node1.num == k){
                        if(count> node1.depth) count = node1.depth;
                        break;
                    }
                    bfs(node1);
                }
            }
        }
    }

    private static boolean inRange(int num) {
        return (num >=0) && (num <=100000);
    }
}
class Node{
    int num;
    int depth;

    public Node(int num, int depth){
        this.depth = depth;
        this.num = num;
    }
}
