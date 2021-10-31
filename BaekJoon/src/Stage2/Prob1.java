package Stage2;

import java.util.Scanner;
public class Prob1{
    public static void main(String[] args){
     Scanner inp= new Scanner(System.in);
     int a=inp.nextInt();
     int b=inp.nextInt();
     if (a>b){
         System.out.println('>');    
     }
     else if (a<b){
         System.out.println('<');

     }
     else{
         System.out.println("==");

     }
    }
}