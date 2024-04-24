import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;
import java.util.stream.Collectors;

public class 영단어_암기는_괴로워 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<String> arr = new ArrayList<>();
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        for(int i=0; i<N; i++){
            String now = br.readLine();
            if(now.length()<M) continue;
            arr.add(now);
        }
        Map<String, Integer> map = new HashMap<>();
        //빈도수 같이 저장
        for (String s : arr) {
            if(map.containsKey(s)) map.put(s, map.get(s)+1);
            else map.put(s,1);
        }

        List<String> words = map.keySet().stream().collect(Collectors.toList());

        words.sort((o1, o2) -> {
            int v1 = map.get(o1);
            int v2 = map.get(o2);

            if(v1 == v2){
                if(o1.length() == o2.length()){
                    return o1.compareTo(o2);
                }
                return o2.length() - o1.length();
            }
            return v2-v1;
        });

        for (String word : words) {
            bw.write(word);
            bw.newLine();
        }
        bw.flush();

    }
}
