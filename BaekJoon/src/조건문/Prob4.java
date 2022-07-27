package Stage2;

import java.util.Scanner;
public class Prob4{
    public static void main(String[] args){
     Scanner inp= new Scanner(System.in);
     int a=inp.nextInt();
     int b=inp.nextInt();
     
     if (a>0){
         if (b>0){
             System.out.println(1);
         }
         else{
             System.out.println(4);
         }}
     else if (b>0){
          System.out.println(2);
      }
     else{
          System.out.println(3);
      }
     }
}
