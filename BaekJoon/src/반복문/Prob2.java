package Stage3;

import java.util.Scanner;
public class Prob2{
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        int i=scan.nextInt();
        for (;i>0;i--){
            int a= scan.nextInt();
            int b= scan.nextInt();
            System.out.println(a+b);
        }
    }
}