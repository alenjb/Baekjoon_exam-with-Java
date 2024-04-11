package 동적프로그래밍;

import java.util.Arrays;
import java.util.Scanner;

public class 피보나치_바텀업_방식 {
    static int [] arr;
    public static void main(String [] args)throws Exception{
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        arr = new int[a+1];
        Arrays.fill(arr,-1);
        arr[0] = 0;
        arr[1] =1;
        if(a>=2){
            for(int i=2; i<=a; i++){
                arr[i] = arr[i-1] + arr[i-2];
            }
        }
        System.out.println(arr[a]);
    }

}
