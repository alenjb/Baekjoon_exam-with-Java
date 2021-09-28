package Stage7;

import java.util.Scanner;

public class Prob2 {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int ch= scanner.nextInt(); int result=0;
		String num= scanner.next();
		for(int i=0; i<ch; i++) {
			result= result+ Integer.parseInt((num.charAt(i)+""));
		}
		System.out.println(result);
		scanner.close();
	}
}
