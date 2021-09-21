package Stage6;

import java.util.Scanner;

public class Prob3 {
	static int count=0;
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int ch= scanner.nextInt();
		countfunc(ch);
		}
	static void countfunc(int ch) {
		for(int i=1; i<=ch; i++) {
			int a= i/1000; int b= i/100-10*a;
			int c= i/10- 100*a-10*b; int d=i%10;
			if((a!=0&&b+c==a+d) || (a==0&&2*c==b+d) || (a==0&&b==0)) {
				count++;
		}

	}
		System.out.println(count);

	}}
