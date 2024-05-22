package BFS_DFS;

import java.io.*;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class _4연산 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long s = Long.parseLong(st.nextToken());
        long t = Long.parseLong(st.nextToken());
        // 같은 경우
        if(s == t) {
            bw.write(0+"");
            bw.flush();
            return;
        }
        HashSet<Long> visited = new HashSet<>();
        Queue<Num> q = new LinkedList<>();
        q.add(new Num(s,""));
        while (!q.isEmpty()){
            Num poll = q.poll();
            long s1 = poll.s;
            String line = poll.line;
            if(s1 == t) {
                bw.write(line);
                bw.flush();
                return;
            }
            if(!visited.contains(s1)){
                visited.add(s1);
                if(s1*s1 <= t) q.add(new Num(s1*s1, line+"*"));
                if(s1+s1 <= t) q.add(new Num(s1+s1, line+"+"));
                if(s1/s1 <= t) q.add(new Num(s1/s1, line+"/"));
            }
        }
        bw.write(-1+"");
        bw.flush();

    }
}
class Num{
    long s;
    String line;

    public Num(long s, String line) {
        this.s = s;
        this.line = line;
    }
}
