import java.io.*;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class 소프티어_1번 {
    // Comparator를 사용하여 우선순위 큐 생성 (숫자가 작은 것이 더 높은 우선순위)
    static PriorityQueue<String> pqBig = new PriorityQueue<>(new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            // 앞자리가 더 큰거
            int o1L = o1.length();
            int o2L = o2.length();
            int minL = Math.min(o1L, o2L);
            for (int i = 0; i < minL; i++) {
                // 그 다음자리가 더 큰거
                if (o1.charAt(i) != o2.charAt(i)) return o2.charAt(i) - o1.charAt(i);
            }
            // 같다면 더 짧은거
            // 같다면 더 긴거
            if (o1L > o2L) {
                // o1이 늦게
                if (o1.charAt(minL) >= o2.charAt(minL - 1)) {
                    return o2L - o1L;
                }
            }
            if (o1L < o2L) {
                // o2가 늦게
                if (o2.charAt(minL) >= o1.charAt(minL - 1)) {
                    return o2L - o1L;
                }
            }
            return o1L - o2L;
/*
            return Integer.compare(o1, o2); // 또는 o1 - o2
            //반환 값이 작은 객체가 더 높은 우선순위
*/
        }
    });
    static PriorityQueue<String> pqSmall = new PriorityQueue<>(new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            // 앞자리가 더 작은거
            int o1L = o1.length();
            int o2L = o2.length();
            int minL = Math.min(o1L, o2L);
            for(int i=0; i<minL; i++){
                // 그 다음자리가 더 작은거
                if(o1.charAt(i)!= o2.charAt(i)) return o1.charAt(i) - o2.charAt(i);
            }
            // 같다면 더 긴거
            if(o1L > o2L){
                // o1이 늦게
                if(o1.charAt(minL) >= o2.charAt(minL-1)){
                    return o1L - o2L;
                }
            }
            if(o1L < o2L){
                // o2가 늦게
                if(o2.charAt(minL) >= o1.charAt(minL-1)){
                    return o1L - o2L;
                }
            }

            return o2L - o1L;
/*
            return Integer.compare(o1, o2); // 또는 o1 - o2
            //반환 값이 작은 객체가 더 높은 우선순위
*/
        }
    });

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String big ="";
        String small ="";
        while (st.hasMoreTokens()){
            String s1 = st.nextToken();
            pqBig.add(s1);
            pqSmall.add(s1);
        }
        int size = pqBig.size();
        for(int i=0; i<size; i++){
            big = big + pqBig.poll();
            small = small + pqSmall.poll();
        }
        long bigL = Long.parseLong(big);
        long smallL = Long.parseLong(small);
        bw.write(bigL+ smallL +"");
        bw.flush();
    }
}
