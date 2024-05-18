import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 이동하기 {
    static int [][] arr;
    static int [][] result;
    static int n, m;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n][m];
        result = new int[n][m];

        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<m;j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        result[0][0] = arr[0][0];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                // 오른쪽으로 가기
                if(j+1<=m-1){
                    int num = arr[i][j + 1] + result[i][j];
                    if(num > result[i][j+1]) result[i][j+1] = num;
                }
                //아래로 가기
                if(i+1<=n-1){
                    int num = arr[i + 1][j]+ result[i][j];
                    if(num > result[i+1][j]) result[i+1][j] = num;
                }
            }
        }
        System.out.println(result[n-1][m-1]);
    }
}
