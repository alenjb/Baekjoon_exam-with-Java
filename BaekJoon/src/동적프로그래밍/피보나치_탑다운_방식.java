package 동적프로그래밍;

import java.util.Arrays;
import java.util.Scanner;

public class 피보나치_탑다운_방식 {
    static int [] arr;
    public static void main(String [] args)throws Exception{
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        arr = new int[a+1];
        Arrays.fill(arr, -1);
        arr[0] = 0;
        arr[1] = 1;

        Fibo(a);
        System.out.println(arr[a]);
    }

    static int Fibo(int a){
        if(arr[a]!=-1) return arr[a];
        else return arr[a] =  Fibo(a-1) + Fibo(a-2);
    }
}
