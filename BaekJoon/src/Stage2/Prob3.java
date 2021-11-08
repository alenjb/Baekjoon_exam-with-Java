package Stage2;

import java.util.Scanner;
public class Prob3{
    public static void main(String[] args){
     Scanner inp= new Scanner(System.in);
     int a=inp.nextInt();
     if ((a%4==0)&&(a%100!=0)){
        System.out.println(1);    
     }
     else if (a%400==0){
         System.out.println(1);
     }
     else{
         System.out.println(0);
     }
    }
}