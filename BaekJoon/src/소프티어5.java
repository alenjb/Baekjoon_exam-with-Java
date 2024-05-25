import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class 소프티어5 {
    static String [][] arr;
    static int [] dx = {0, 1, 0, -1};
    static int [] dy = {-1, 0, 1, 0};
    static int N;
    static List<Node> list = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        arr = new String[N][N];
        for(int i=0; i<N ; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++){
                String now = st.nextToken();
                if('A'<= now.charAt(0) && 'Z'>= now.charAt(0)){
                    Node node = new Node(j, i);
                    list.add(node);
                }
                arr[i][j] = st.nextToken();
            }
        }
        // 1이면 위, 2이면 오른쪽 3이면 아래, 4이면 왼쪽으로부터 온 것임
        int from=0;


    }
    static class Node{
        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
