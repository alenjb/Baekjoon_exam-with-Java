package Stage3;

import java.util.Scanner;
public class Prob9{
	public static void main(String[] args){
	        Scanner scanner= new Scanner(System.in);
	        int num= scanner.nextInt();
	        for (int i=1; i<num+1; i++){
	            for (int k=1;k!=i+1;k++){
	                System.out.printf("*");
	        }
	        System.out.printf("\n");}
	    }
}
