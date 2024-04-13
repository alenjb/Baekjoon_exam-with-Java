package 구간합;

import java.util.Scanner;

public class 수열 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int result=0;
        int [][] arr = new int[2][N];
        for(int i=0; i<N; i++){
            arr[0][i] = sc.nextInt();
            if(i>=1){
                arr[1][i] = arr[0][i] + arr[1][i-1];
            }else arr[1][i] = arr[0][i];
        }
        int sum =Integer.MIN_VALUE;
        for(int i=0; i<=N-K; i++){
            int summ=0;
            if (i==0) summ = arr[1][K-1];
            if(i>=1) summ =arr[1][(i+K-1)] - arr[1][i-1];
            if(sum < summ) sum =summ;
        }

        System.out.println(sum);

    }
}
