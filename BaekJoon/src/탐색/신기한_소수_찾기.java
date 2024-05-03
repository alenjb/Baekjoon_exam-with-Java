package 탐색;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class 신기한_소수_찾기 {
    //2 ~ 마지막 자리 1,3,7,9
    static int [] available = {1,3,7,9};
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter((new OutputStreamWriter(System.out)));
        int n = Integer.parseInt(br.readLine());

        // 첫자리 2,3,5,7,9
        int [] first = {2,3,5,7,9};
        // 첫째 자리에 가능한 숫자들부터 DFS
        for(int k: first){
            dfs(n, k);
        }
        bw.write(sb.toString());
        bw.flush();
    }

    /**
     * DFS를 통해 각 자리수에 맞는 소수를 찾는 메서드
     */

    private static void dfs(int depth, int num) {
        // 만약 깊이가 1이면(해당하는 자리수에 도달하면)
        if(depth == 1) {
            if(prime(num)) sb.append(num+"\n");
        }
        else {
            // 만약 소수이면
            if(prime(num)){
                // 뒷자리에 가능한 것들 중에서 하나를 꺼내서 뒤에 붙이기
                for(int i : available){
                    int newNum = num * 10 + i;
                    // 깊이를 1개 줄여서(깊이를 줄인다는 것은 자리수를 늘린다는 것을 의미) DFS 호출
                    dfs(depth-1, newNum);
                }

            }
        }

    }

    /**
     * 소수인지 판별하는 메서드
     */
    private static boolean prime(int num)
    {
        // 만약 루트 num보다 크면 약수가 될 수 없으므로 루트 num 까지만 검사
        for(int i=2; i<=Math.sqrt(num); i++){
                if(num % i ==0) return false;}
        return true;
    }
}
