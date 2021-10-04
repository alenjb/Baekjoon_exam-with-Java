package Stage4;
import java.util.Scanner;

public class Prob1{

	public static void main(String[] args){
	    Scanner scanner= new Scanner(System.in);
	    int a=1; int b=1;
	    while((a!=0)&&(b!=0)){
	        a= scanner.nextInt();
	        b= scanner.nextInt();
	        if ((a!=0)&&(b!=0))
	        	System.out.println((a+b));
	    }	
	}
}

