package 집합과_맵;

import java.io.*;
import java.util.*;

public class 듣보잡 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        String [] neverSeen = new String[N];
        String [] neverHeard = new String[M];

        for(int i=0; i<N; i++){
            neverSeen[i] = br.readLine();
        }
        for(int i=0; i<M; i++){
            neverHeard[i] = br.readLine();
        }
        HashSet<String> no = new HashSet<>();
        List<String> result = new ArrayList<>();
        for(int i=0; i<N; i++){
            no.add(neverSeen[i]);
        }
        for(int i=0; i<M; i++){
            int size = no.size();
            no.add(neverHeard[i]);
            if(size == no.size()) result.add(neverHeard[i]);
        }
        Collections.sort(result);

        bw.write(result.size()+"\n");
        for(String i : result){
            bw.write(i+"\n");
        }
        bw.flush();



    }
}
