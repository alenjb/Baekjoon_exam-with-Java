package Stage3;

import java.util.Scanner;
public class Prob11{
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        int num=scanner.nextInt();
        int k=scanner.nextInt();
        int [] nums = new int[num];
        for(int i=0; i<num;i++){
           nums[i]=scanner.nextInt();
        }
        for(int i=0; i<num;i++){
           if (nums[i]<k){
               System.out.printf("%d ", nums[i]);
               
           }
        }

    }
}