package Stage3;

import java.util.Scanner;
public class Prob10 {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        int num= scanner.nextInt();
        for (int i=1; i<num+1; i++){
            for(int k=num-i; k>0; k--)
                System.out.printf(" ");
            for (int p=i; p>0 ;p--)
                System.out.printf("*");
            System.out.printf("\n");}
    }
}
