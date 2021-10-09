package Stage3;


import java.util.Scanner;
public class Prob1{
	public static void main(String[] args){
	    Scanner num= new Scanner(System.in);
	    int ans= num.nextInt();
	    for (int i=1; i<10; i++){
	        System.out.println(ans+" * "+i+" = "+(ans*i));
	    }
	}
}

