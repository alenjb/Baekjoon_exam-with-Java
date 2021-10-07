package Stage4;
import java.util.Scanner;
public class Prob3{
	public static void main(String[] args){
	    Scanner scanner= new Scanner(System.in);
	    int num= scanner.nextInt();
	    int first=num;
	    int r=0;
	    int a=0;
	    while(true){
	        if (num==first&&a==1){
	            System.out.println(r);
	            break;}
	        else if (num<10){
	            num=num*11;
	            r++;}
	        else {
	            num=(num/10+num%10)%10+(num%10)*10;
	            r++;}
	        a=1;
	    }

    }
  }

