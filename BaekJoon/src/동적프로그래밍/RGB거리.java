package 동적프로그래밍;

import java.util.Scanner;

public class RGB거리 {
    static long [][] arr;
    static long [][] cost;
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new long [n][3];
        cost = new long [n][3];

        for(int i=0; i<n; i++){
            for(int j=0; j<3; j++){
                long l = sc.nextLong();
                arr[i][j] = l;
            }
        }

        // 첫째 줄
        cost[0][0] = arr[0][0];
        cost[0][1] = arr[0][1];
        cost[0][2] = arr[0][2];

        System.out.println(Math.min(Math.min(calculate(n-1, 0),
                calculate(n-1, 1)),
                calculate(n-1, 2)
        ));
    }

    static  long calculate(int num, int color){
        // 아직 계산 안했으면
        if(cost[num][color] == 0){

            if(color == 0){
                cost[num][0] = Math.min(calculate(num-1, 1), calculate(num-1, 2)) + arr[num][0];
            }
            if(color == 1){
                cost[num][1] = Math.min(calculate(num-1, 0), calculate(num-1, 2)) + arr[num][1];
            }
            if(color == 2){
                cost[num][2] = Math.min(calculate(num-1, 1), calculate(num-1, 0)) + arr[num][2];
            }

        }
        return cost[num][color];
    }
}
