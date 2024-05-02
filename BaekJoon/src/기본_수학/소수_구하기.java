package 기본_수학;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 소수_구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        int [] arr = new int[end+1];

        for(int i = 2; i<=end; i++){
            arr[i] = i;
        }

        for(int i=2; i<=Math.sqrt(end); i++){
            if(arr[i] == 0) continue;
            for(int j = i+i; j<=end; j=j+i){
                arr[j] = 0;
            }
        }
        for(int i=start; i<=end; i++){
            if (arr[i]!=0) sb.append(arr[i]+"\n");
        }
        System.out.print(sb.toString());
    }
}
